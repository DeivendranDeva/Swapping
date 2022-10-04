package practice_Java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_handling 
{

	public static void main(String[] args) 
	{
		Exception_handling handle = new Exception_handling();
		                 //  handle.div();
		                 //  handle.add(20, 5);
		                     handle.sub(20, 10);		                     
	}
	
	void div()
	{
		try 
		{		
			
			Scanner sc = new Scanner(System.in);			
//			System.out.println("Enter option");
//			int d = sc.nextInt();
			
			
//			int arr[] = {1,2,3,4,5};				
//	    	System.out.println(arr[6]);
//	    	
	    	String st = "Aslan";
	    	System.out.println(st.charAt(6));

//			System.out.println("Enter 1st the values :");
//			int x = sc.nextInt();
//			System.out.println("Enter 2nd the values :");
//			int y = sc.nextInt();
//			System.out.println(x/y);
						
//			System.out.println("Enter age values :");
//			int g = sc.nextInt();
//			System.out.println(g);

         	//	System.out.println(a/b);	
		}
	    catch(ArrayIndexOutOfBoundsException c)
		{    	
	    	System.out.println("Give correct index for array");
	    	div();
		}
		
		catch(StringIndexOutOfBoundsException c)
		{
			System.out.println("Give correct index for String");
		}
		
		catch(NullPointerException c)
		{
		System.out.println("Don't give null");	
		}
		
//		catch(NegativeNumberException c) 
//		{
//			
//		}
		
		catch(InputMismatchException c)
		{
		System.out.println("Please enter integer");	
		}
		
		catch(ArithmeticException c)
		{
		System.out.println("Does'nt work, because /zero");	
		}
		
		catch(Exception c)
		{
		System.out.println("Exception Caught");	
		c.getMessage();
		c.printStackTrace();
		}
		
	}
	
	
	void subject()
	{
		Scanner sc = new Scanner(System.in);			
		System.out.println();
	}
	 void welcome()
	 {
	    System.out.println("Welcome");	
	 } 
	 
	void add(int a, int b)
	{
		System.out.println(a+b);
		sub(3,1);
		
	}
    void sub(int a, int b)
    {
    	System.out.println(a-b);
    	div();
    }
   
    
}
