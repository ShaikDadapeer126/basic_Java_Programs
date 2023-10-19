import java.util.Scanner;
public class positive_neagative_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it is positive or negative");
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println(num+" is a positive number");
		}else {
			System.out.println(num+" is a negative number");
		}
	}
}
