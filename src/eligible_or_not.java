import java.util.Scanner;
public class eligible_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check your eligibility by entering your age");
		int age = sc.nextInt() ;
		
		if(age >=21) {
			System.out.println("Your eligible for Shadi.com");
		}else {
			System.out.println("your not eligible for Shadi.com");
		}
	}
}
