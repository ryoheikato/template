package com.internousdev.template.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dao.ReservationInfoDAO;
import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.dto.ReservationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * ログインID
	 */
	public String loginUserId;

	/**
	 * ログインパスワード
	 */
	public String loginPassword;

	/**
	 * 処理結果を格納
	 */
	public String result;

	/**
	 * ログイン情報を格納
	 */
	public Map<String, Object> loginUserInfoMap = new HashMap<>();

	/**
	 * ログイン情報取得DAO
	 */
	public LoginDAO loginDAO = new LoginDAO();

	/**
	 * ログイン情報格納IDTO
	 */
	private LoginDTO loginDTO = new LoginDTO();

	/**
	 * アイテム情報を取得
	 */
	public ReservationInfoDAO ReservationInfoDAO = new ReservationInfoDAO();

	/**
	 * 実行メソッド
	 */
	public String execute() {

		result = ERROR;

		// ログイン実行
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		loginUserInfoMap.put("loginUser", loginDTO);

		// ログイン情報を比較
		if(((LoginDTO) loginUserInfoMap.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;

			// アイテム情報を取得
			ReservationInfoDTO ReservationInfoDTO = ReservationInfoDAO.getReservationInfo();
			loginUserInfoMap.put("login_user_id", loginDTO.getLoginId());
			loginUserInfoMap.put("reservation_id", ReservationInfoDTO.getReservation_id());
			loginUserInfoMap.put("room_name", ReservationInfoDTO.getRoom_name());
			loginUserInfoMap.put("reservation_price", ReservationInfoDTO.getReservation_price());

			return result;
		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> loginUserInfoMap) {
		this.loginUserInfoMap = loginUserInfoMap;
	}
}
