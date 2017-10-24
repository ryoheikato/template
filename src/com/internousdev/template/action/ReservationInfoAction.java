
package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ReservationInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReservationInfoAction extends ActionSupport implements SessionAware {

	/**
	 * アイテム情報を取得
	 */
	public ReservationInfoDAO ReservationInfoDAO = new ReservationInfoDAO();

	/**
	 * アイテム購入個数
	 */
	public int count;

	/**
	 * 支払い方法
	 */
	public String pay;

	/**
	 * アイテム情報を格納
	 */
	public Map<String, Object>  ReservationInfoMap = new HashMap<>();

	/**
	 * 処理結果
	 */
	public String result;

	/**
	 * 予約情報取得メソッド
	 *
	 * @author internous
	 */
	public String execute() {
		result = SUCCESS;
		ReservationInfoMap.put("count", count);
		int intCount = Integer.parseInt(ReservationInfoMap.get("count").toString());
		int intPrice = Integer.parseInt(ReservationInfoMap.get("reservation_price").toString());

		ReservationInfoMap.put("total_price", intCount * intPrice);
		String payment;

		if(pay.equals("1")) {

			payment = "現金払い";
			ReservationInfoMap.put("pay", payment);
		} else {

			payment = "クレジットカード";
			ReservationInfoMap.put("pay", payment);
		}
		return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> ReservationInfoMap) {
		this.ReservationInfoMap = ReservationInfoMap;
	}
}