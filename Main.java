package fibonacci_1;

import java.util.Scanner;

import java.util.Scanner;

public class Main{
	
	static int a, b, c;
	
	public static void main(String... args){
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please, enter the length of the fibonacci sequence");
		int n = console.nextInt();
		
		getFibonacci(n);
		
	}
	
	static void getFibonacci(int n){ // n = 4
		if (n < 2){ // 4 > 2 , 3 > 2, 2 = 2, 1 < 2
			a = 0;
			b = 1;
		}else{
			getFibonacci(--n); // 
			c = b;     // c = 1, c = 1, c = 2      
			b = a + b; // b = 1, b = 2, b = 3; 
			a = c;     // a = 1, a = 1, a = 2
		}
		System.out.print(a + " "); // 0 1 1 2
	}
	
}
