package model.dao;

import model.dao.impl.SellerDaoIJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoIJDBC();

	}
}
