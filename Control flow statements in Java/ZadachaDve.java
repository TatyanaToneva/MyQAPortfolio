import java.util.Scanner;

// Write a Java program to allow the user to input his/her age.
// Then the program will show if the person is eligable to work.
// A person who is eligible to work must be older or equal to 16 years old.


public class ZadachaDve {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = Integer.parseInt(sc.nextLine());
if (age >=16); {
	System.out.println("You are eligible to work!"); 
	} 

	System.out.println("You are not eligible to work!");

 sc.close();
	}
		
	}

