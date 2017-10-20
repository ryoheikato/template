package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ReservationComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReservationConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> ReservationInfoSession = new HashMap<String, Object>();

	public String result;

	public ReservationComplateDAO ReservationComplateDAO = new ReservationComplateDAO();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	public String execute() throws SQLException {

		ReservationComplateDAO.buyItemInfo(
				ReservationInfoSession.get("id").toString(),
				ReservationInfoSession.get("login_user_id").toString(),
				ReservationInfoSession.get("total_price").toString(),
				ReservationInfoSession.get("count").toString(),
				ReservationInfoSession.get("pay").toString());

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> ReservationInfoSession) {
		this.ReservationInfoSession = ReservationInfoSession;
	}
}
