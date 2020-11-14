//Find the biggest element of an array and print it in the console java.
public class ZadachaChetiri {

	public static void main(String[] args) {
		int[] array = { 14, 28, 75, 4, -10, 200};
		int biggestElement = array[0];
		for(int i = 1; i < array.length;i++) { if(array[i] > biggestElement)
		{
		biggestElement = array[i];
		}
		}
		 
		System.out.println("The Array is:");
		for(int i = 0; i < array.length;i++)
		{
		System.out.println(array[i]);
		}
		 
		System.out.println("The Biggest Element is:" + biggestElement);
		}
		}
		
		
		
		
		
		
		
		
		
		
	
