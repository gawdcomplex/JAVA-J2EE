package DAY5;


public class ExcepH {

	public static void main(String[] args) {
	
		int a[]= {4,5,6,7};
		  
		try {
		System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException    obj)
		{
			System.out.println("please access indexes from 0 to 3");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("dont divide the no by 0");
		}
		
		System.out.println("hello working?");
		
	}

}




/* 
 * 
 * try catch throw throws finally
 * custom exception
 */













/*
  any runtime error which disrupts the flow of the executiona nd stops the program



*/