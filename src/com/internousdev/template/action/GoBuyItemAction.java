
package com.internousdev.template.action;

import java.sql.SQLException;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoBuyItemAction extends ActionSupport {

	private int id;

	private BuyItemDTO displayList = new BuyItemDTO();

	public String execute() throws SQLException {
		String result = ERROR;
		BuyItemDAO dao = new BuyItemDAO();
		displayList = dao.select(id);

			result = SUCCESS;

		return result;
	}

	public BuyItemDTO getDisplayList(){
		return displayList;
	}


}
