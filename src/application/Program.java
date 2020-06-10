package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

//		System.out.println("=== TESTE 1: seller findById ===");
//		Seller seller = sellerDao.findById(1);
//		System.out.println(seller);
//		
//		System.out.println("\n=== TESTE 2: seller findByDepartment ===");
//		Department department = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(department);
//
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TESTE 3: seller findAll ===");
//		list = sellerDao.findAll();
//
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("\n=== TESTE 4: seller Insert ===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		
//		System.out.println("Inserido! Novo Id: " + newSeller.getId());
//			
//		System.out.println("\n=== TESTE 5: seller Update ===");		
//		seller = sellerDao.findById(1);
//		seller.setName("Felps");
//		sellerDao.update(seller);
//		System.out.println("Update completo!");

		System.out.println("\n=== TESTE 6: seller DELETE ===");
		System.out.println("Entre com o id para deletar: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("DELETADO!");

		sc.close();
	}

}
