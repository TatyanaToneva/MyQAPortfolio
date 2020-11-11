//Print pine tree using asterisks in the console.

public class ZadachaChetiri {

	public static void main(String[] args) {

		drawPineTree (9);
	}
	

		private static void drawPineTree (int n)
		{
			for (int i =0; i <n; i++);
			int i;
			triangle ( i  +1, n);
			
		}
		
		private static void triangle (int n, int max) {
		for (int j=0; j< max -1; j++);
		System.out.println(" ");
		
		for (int j = 0; j<i*2+1; j++)
			System.out.println("x");
		System.out.println(" ");
		
		}
		
	}


