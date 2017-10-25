/**
 *
 */
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class HomeDAO {
	public ArrayList<BuyItemDTO> select(){
		ArrayList<BuyItemDTO> reservationList = new ArrayList<BuyItemDTO>();
		DBConnector db=new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM item_info";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemImage(rs.getString("item_image"));
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
