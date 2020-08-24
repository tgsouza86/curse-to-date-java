package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductArray;

public class ProgramSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductArray[] vect = new ProductArray[n];
		for (int i =0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductArray(name, price);
			
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / vect.length;
		System.out.println("AVARAGE PRICE: %.2f%n" + avg);
	}

}
