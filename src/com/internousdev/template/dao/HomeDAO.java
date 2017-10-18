/**
 *
 */
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ReservationInfoDTO;
import com.internousdev.template.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class HomeDAO {
	public ArrayList<ReservationInfoDTO> select(){
		ArrayList<ReservationInfoDTO> reservationList = new ArrayList<ReservationInfoDTO>();
		DBConnector db=new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM reservation_info";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ReservationInfoDTO dto = new ReservationInfoDTO();
				dto.setReservation_id(rs.getInt("reservation_id"));
				dto.setRoom_name(rs.getString("room_name"));
				dto.setReservation_price(rs.getInt("reservation_price"));
				dto.setItem_image(rs.getString("item_image"));
				reservationList.add(dto);
			}

			rs.close();
			ps.close();

		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return reservationList;
	}
}
