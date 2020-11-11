import java.util.Scanner;

public class ZadachaEdno {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in); {
		}	
		System.out.println("Angle1:  ");
		int angel1=sc.nextInt();
		Scanner sc1 =new Scanner (System.in); {
		System.out.println("Angle2:  ");
		int angel2=sc1.nextInt();{
		Scanner sc2 =new Scanner (System.in); {
		System.out.println("Angle3:  ");
		int angle3=sc2.nextInt();
		int angel3=sc2.nextInt();
		int sum = (angel1+angel2+angel3);
		{
		if (sum !=180); {
		System.out.println ("It's impossible to built a triagle!");
		
		}
		
		boolean acute1Triangle = angel3 <90;
		boolean acute2Triangle = angel2 <90;
		boolean acute3Triangle = angel3 <90;
		boolean sum1 = (acute1Triangle||acute2Triangle||acute3Triangle);
		
		if (acute1Triangle || acute2Triangle || acute3Triangle);
		System.out.println("The triangle is accute! +  sum 1");
		}
		}
		}
		}
	}
}

