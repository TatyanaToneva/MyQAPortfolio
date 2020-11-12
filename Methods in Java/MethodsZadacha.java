//Nai-malko chislo ot 3
public class MethodsZadacha {

	public static void main(String[] args) {
		
		int number = smallestNumber (4,20,-3);
		System.out.println(number);
		int number1 = smallestNumber (7,2,-10);
		System.out.println(number1);
		int number2 = smallestNumber (1,36,-8);
		System.out.println(number2);
		int number3 = smallestNumber (4,-5,-5);
		System.out.println(number3);

	}
public static int smallestNumber (int a, int b, int c) {
	int smallestNumber;
	if (a > b) {
		smallestNumber = b;
	} else {
		smallestNumber = a;
	}	
	if (a > c) {
		smallestNumber = c;
	} else {
		smallestNumber = a;
	}
		if (b > c) {
			smallestNumber = c;
		} else {
			smallestNumber = b;
		
		}
			return smallestNumber;
		}
{

			
}

}
	

