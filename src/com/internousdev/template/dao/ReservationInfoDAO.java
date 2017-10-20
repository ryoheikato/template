package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.ReservationInfoDTO;
import com.internousdev.template.util.DBConnector;

public class ReservationInfoDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ReservationInfoDTO reservationInfoDTO = new ReservationInfoDTO();

	/**
	 * 商品情報取得メソッド
	 *
	 * @return ReservationInfoDTO
	 */
	public ReservationInfoDTO getReservationInfo() {

		String sql = "SELECT reservation_id, room_name, reservation_price FROM reservation_info";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				reservationInfoDTO.setReservation_id(resultSet.getInt("reservation_id"));
				reservationInfoDTO.setRoom_name(resultSet.getString("room_name"));
				reservationInfoDTO.setReservation_price(resultSet.getInt("reservation_price"));
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return reservationInfoDTO;
	}

	public ReservationInfoDTO getReservationInfoDTO() {
		return reservationInfoDTO;
	}
}