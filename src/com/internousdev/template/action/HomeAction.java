package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.HomeDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private Map<String, Object> loginUserInfoMap = new HashMap<String, Object>();
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;

	private HomeDAO homeDAO = new HomeDAO();

	// DAOからの戻り値を取得する箱
	private ArrayList<BuyItemDTO> buyItemDTOList;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCESS
	 */
	public String execute() {
		String result = SUCCESS;

		buyItemDTOList = homeDAO.select();
		setA(buyItemDTOList.get(0).getItemImage());
		setB(buyItemDTOList.get(1).getItemImage());
		setC(buyItemDTOList.get(2).getItemImage());
		setD(buyItemDTOList.get(3).getItemImage());
		setE(buyItemDTOList.get(4).getItemImage());

		if (session.containsKey("id")) {
			loginUserInfoMap.putAll(session);
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public void setsession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getsession() {
		return this.session;
	}

	/**
	 * @return a
	 */
	public String getA() {
		return A;
	}

	/**
	 * @param a セットする a
	 */
	public void setA(String a) {
		A = a;
	}

	/**
	 * @return b
	 */
	public String getB() {
		return B;
	}

	/**
	 * @param b セットする b
	 */
	public void setB(String b) {
		B = b;
	}

	/**
	 * @return c
	 */
	public String getC() {
		return C;
	}

	/**
	 * @param c セットする c
	 */
	public void setC(String c) {
		C = c;
	}

	/**
	 * @return d
	 */
	public String getD() {
		return D;
	}

	/**
	 * @param d セットする d
	 */
	public void setD(String d) {
		D = d;
	}

	/**
	 * @return e
	 */
	public String getE() {
		return E;
	}

	/**
	 * @param e セットする e
	 */
	public void setE(String e) {
		E = e;
	}
}
