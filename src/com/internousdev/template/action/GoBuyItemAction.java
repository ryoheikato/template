
package com.internousdev.template.action;

import java.sql.SQLException;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoBuyItemAction extends ActionSupport {

	private int id;

	private String item_image;

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

	public void setDisplayList(BuyItemDTO displayList){
		this.displayList = displayList;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
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


}
