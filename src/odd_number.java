import java.util.*;
public class odd_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("odd number to Start = ");
		int m=sc.nextInt();
		
		System.out.print("odd number to stop = ");
		int n = sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+",");
			}
		}
	}
}
