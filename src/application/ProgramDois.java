package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		

		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		
		//System.out.println(product.toString());
		 System.out.println("Product data: " + product);
		 
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		//Atualização da quantidade do objeto product
		product.addProducts(quantity);
		
		
		System.out.println();	
		System.out.println("Update: " + product);
		 
		System.out.println();	
	    System.out.println("Enter the number of products to be removed in stock: ");
	    quantity = sc.nextInt();
	    product.removeProducts(quantity);
			
		
	    //System.out.println(product.name +  ',' + product.price + ',' + product.quantity + ',' );
		
		System.out.println();	
		System.out.println("Update: " + product);
		
		sc.close();

	}

}
