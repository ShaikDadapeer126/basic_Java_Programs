import java.util.*;
public class natural_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number to Start = ");
		int m=sc.nextInt();
		
		System.out.print("numbet to Stop = ");
		int n=sc.nextInt();
		
		for(int i=m;i<n;i++) {
			if(i>0) {
			System.out.print(i);
			}
		}
	}
}
