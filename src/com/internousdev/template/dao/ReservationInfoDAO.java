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

		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				reservationInfoDTO.setId(resultSet.getInt("reservation_id"));
				reservationInfoDTO.setItemName(resultSet.getString("room_name"));
				reservationInfoDTO.setItemPrice(resultSet.getInt("reservation_price"));
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