import java.util.*;
public class even_num_m2n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print");
		
		System.out.println("Enter Starting number to print");
		int m = sc.nextInt();
		System.out.println("Enter Ending number to print");
		int n = sc.nextInt();
		
		for(int i=m; i<=n;i++) {
			if(i%2==0) {
				System.out.print("Even number for "+m+" to "+n +" = ");
				System.out.println(i);
			}
		}
	}
}
