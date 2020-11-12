//Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class ZadachaVtora {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The first number is:  ");
        double num1 = sc.nextDouble();
        System.out.print("The second number is:  ");
        double num2 = sc.nextDouble();
        System.out.print("The third number is:  ");
        double num3 = sc.nextDouble();
        System.out.print("The average value is " + average(num1, num2, num3)+"\n" );
    }
 
  public static double averageNumber(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
  {
}


}


