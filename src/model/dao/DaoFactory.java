package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoIJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoIJDBC(DB.getConnection());

	}

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
