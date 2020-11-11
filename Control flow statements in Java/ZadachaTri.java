// Write a Java program to calculate the revenue from a sale based on the unit price
//and quantity of a product iput by the user. The discount rate is 15% for the quantity
//purchased between 100 and 120 units, and 20%,for the quantity purchased greater than
//120 units...

import java.util.Scanner;


public class ZadachaTri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter unit price:  ");
		
		int price = sc.nextInt();
		System.out.println("Enter quantity:  ");
		int quantity = sc.nextInt();
		
		double discountedTotal = quantity * price;
		
		if  (quantity > 100 && quantity < 120) {
			discountedTotal = (discountedTotal * 0.85);
		}
		if ( quantity >= 120) {
			discountedTotal = (discountedTotal * (0.80));
			}
			System.out.println("Total:  "   +  discountedTotal );
			double discount = quantity * price - discountedTotal;
			System.out.println("Discount:  " + discount);
			
		}

	}


