import java.util.Scanner;
public class even_odd_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check even or odd");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
}
