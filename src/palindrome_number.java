import java.util.*;
public class palindrome_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check weather it a palindrom are not");
		int number = sc.nextInt();
		
		int rev=0;
		int number1=number;
		while(number>0) {
			int last =number%10;
			rev = (rev*10)+last;
			number=number/10;
		}
		if(number1==rev) {
			System.out.println(rev+" is a palindrome");
		}else {
			System.out.println(rev+" is not a palindrome");
		}
	}
}
