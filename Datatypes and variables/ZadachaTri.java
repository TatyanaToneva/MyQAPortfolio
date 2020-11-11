// Print the areheight)/2a area of a triangle by given sides. Use formula to calculate it.
// area = (width
import java.util.Scanner;

public class ZadachaTri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the width of the triangle:  ");
		double b=sc.nextDouble();
		
		System.out.println("Enter the height of the triangle:  ");
		double h =sc.nextDouble();
		
		double area = (b*h)/2 ;
		
System.out.println("The area of the triangle is:  "  + area);

}
	}


