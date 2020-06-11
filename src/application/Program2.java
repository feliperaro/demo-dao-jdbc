package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TESTE 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TESTE 2: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();

		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TESTE 3: department Insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserido! Novo Id: " + newDepartment.getId());

		System.out.println("\n=== TESTE 5: department Update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completo!");

		System.out.println("\n=== TESTE 6: department DELETE ===");
		System.out.println("Entre com o id para deletar: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("DELETADO!");

		sc.close();
	}

}
