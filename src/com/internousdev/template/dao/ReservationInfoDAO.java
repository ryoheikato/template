package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

		String sql = "SELECT reservation_id, room_name, reservation_price, am_flag, pm_flag, room_flag FROM reservation_info";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				reservationInfoDTO.setReservation_id(resultSet.getInt("reservation_id"));
				reservationInfoDTO.setRoom_name(resultSet.getString("room_name"));
				reservationInfoDTO.setReservation_price(resultSet.getInt("reservation_price"));
				reservationInfoDTO.setAm_flag(resultSet.getInt("am_flag"));
				reservationInfoDTO.setPm_flag(resultSet.getInt("pm_flag"));
				reservationInfoDTO.setRoom_flag(resultSet.getInt("room_flag"));


			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try{
				connection.close();
		}catch(SQLException e){
			e.printStackTrace();
			}
		}

		return reservationInfoDTO;
	}

	public ReservationInfoDTO getReservationInfoDTO() {
		return reservationInfoDTO;
	}
}