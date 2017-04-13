//Exercise 3-9

import java.util.*;
public class Fibonacci {

	static void displaysequence(int iteration) {
		int fib_num1 = 1;
		int fib_num2 = 1;
		int fib_num = 1;
		for(int i = 1; i <= iteration; i++)
		{
			if(i > 2){
				fib_num = fib_num1 + fib_num2;
				fib_num1 = fib_num2;
				fib_num2 = fib_num;
			}
			
			System.out.print(fib_num);
			if((i+1) <= iteration)
				System.out.print(", ");
		}
		System.out.print(".");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int fib_number;
		
		System.out.println("Enter the number to which you want to run the fibonacci sequence:");
		fib_number = input.nextInt();
		
		displaysequence(fib_number);
	}

}
