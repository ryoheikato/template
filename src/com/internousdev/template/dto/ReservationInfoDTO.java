/**
 *
 */
package com.internousdev.template.dto;

/**
 * 予約情報に関するクラス
 * @author internousdev
 *
 */
public class ReservationInfoDTO {

	private int reservation_id;

	private String room_name;

	private int reservation_price;

	private String item_image;

	private int am_flag;

	private int pm_flag;

	private int room_flag;


	/**
	 * @return reservation_id
	 */
	public int getReservation_id() {
		return reservation_id;
	}

	/**
	 * @param reservation_id セットする reservation_id
	 */
	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	/**
	 * @return room_name
	 */
	public String getRoom_name() {
		return room_name;
	}

	/**
	 * @param room_name セットする room_name
	 */
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	/**
	 * @return reservation_price
	 */
	public int getReservation_price() {
		return reservation_price;
	}

	/**
	 * @param reservation_price セットする reservation_price
	 */
	public void setReservation_price(int reservation_price) {
		this.reservation_price = reservation_price;
	}

	/**
	 * @return item_image
	 */
	public String getItem_image() {
		return item_image;
	}

	/**
	 * @param item_image セットする item_image
	 */
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	/**
	 * @return am_flag
	 */
	public int getAm_flag() {
		return am_flag;
	}

	/**
	 * @param am_flag セットする am_flag
	 */
	public void setAm_flag(int am_flag) {
		this.am_flag = am_flag;
	}

	/**
	 * @return pm_flag
	 */
	public int getPm_flag() {
		return pm_flag;
	}

	/**
	 * @param pm_flag セットする pm_flag
	 */
	public void setPm_flag(int pm_flag) {
		this.pm_flag = pm_flag;
	}

	/**
	 * @return room_flag
	 */
	public int getRoom_flag() {
		return room_flag;
	}

	/**
	 * @param room_flag セットする room_flag
	 */
	public void setRoom_flag(int room_flag) {
		this.room_flag = room_flag;
	}



}
