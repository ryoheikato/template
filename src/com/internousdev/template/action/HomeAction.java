package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.HomeDAO;
import com.internousdev.template.dto.ReservationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private Map<String, Object> loginUserInfoMap = new HashMap<String, Object>();
	private String roomA;
	private String roomB;
	private String roomC;
	private String roomD;
	private String roomE;

	private HomeDAO homeDAO = new HomeDAO();

	// DAOからの戻り値を取得する箱
	private ArrayList<ReservationInfoDTO> reservationInfoDTOList;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCESS
	 */
	public String execute() {
		String result = SUCCESS;

		reservationInfoDTOList = homeDAO.select();
		roomA = reservationInfoDTOList.get(0).getItem_image();
		roomB = reservationInfoDTOList.get(1).getItem_image();
		roomC = reservationInfoDTOList.get(2).getItem_image();
		roomD = reservationInfoDTOList.get(3).getItem_image();
		roomE = reservationInfoDTOList.get(4).getItem_image();

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

	public void setLoginUserInfoMap(Map<String, Object> loginUserInfoMap) {
		this.loginUserInfoMap = loginUserInfoMap;
	}

	public Map<String, Object> getLoginUserInfoMap() {
		return this.loginUserInfoMap;
	}

	/**
	 * @return roomA
	 */
	public String getRoomA() {
		return roomA;
	}

	/**
	 * @param roomA セットする roomA
	 */
	public void setRoomA(String roomA) {
		this.roomA = roomA;
	}

	/**
	 * @return roomB
	 */
	public String getRoomB() {
		return roomB;
	}

	/**
	 * @param roomB セットする roomB
	 */
	public void setRoomB(String roomB) {
		this.roomB = roomB;
	}

	/**
	 * @return roomC
	 */
	public String getRoomC() {
		return roomC;
	}

	/**
	 * @param roomC セットする roomC
	 */
	public void setRoomC(String roomC) {
		this.roomC = roomC;
	}

	/**
	 * @return roomD
	 */
	public String getRoomD() {
		return roomD;
	}

	/**
	 * @param roomD セットする roomD
	 */
	public void setRoomD(String roomD) {
		this.roomD = roomD;
	}

	/**
	 * @return roomE
	 */
	public String getRoomE() {
		return roomE;
	}

	/**
	 * @param roomE セットする roomE
	 */
	public void setRoomE(String roomE) {
		this.roomE = roomE;
	}
}
