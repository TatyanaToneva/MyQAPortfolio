import java.util.Scanner;

public class Ponedelnik {

	private static final boolean True = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Has valid driving license? Options are Yes or No:");
		boolean hasValidLicense = sc1.hasNext();
		System.out.println(age);
		System.out.println(hasValidLicense);
		if(age >= 18 && hasValidLicense == true) {
			System.out.println("The user can drive.");
		} else {
			System.out.println("The user can't drive!");
		}
		
sc.close();
sc1.close();
	}

}
