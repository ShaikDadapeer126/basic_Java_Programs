//
//public class factioral_number {
//	public static void main(String[] args) {
//
//		System.out.println("Enter a number to find it's factioral");
//		int number = 6;
//		
//		int prod = 1;
//		
//		for(int i=1;i<=number;i++) {
//			prod = prod*i;
//		}
//		System.out.println("factioral number = "+prod);
//		
//	}
//}


// or

import java.util.*;
public class factioral_number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it's factioral");
		int number= sc.nextInt();
		int prod = 1;
		for(int i=number;i>=2;i--) {
			prod = prod*i;
		}
		System.out.println("factioral number = "+prod);	}
}