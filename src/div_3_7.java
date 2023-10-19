import java.util.*;
public class div_3_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Starting number = ");
		int m = sc.nextInt();
		
		System.out.print("Ending number = ");
		int n= sc.nextInt();
		
		for(int i=m;i<n;i++){
			if(i%3==0 && i%7==0) {
				System.out.println("number divisible by 3 & 7 from "+m+" to "+n+" = "+i);
			}
		}
	}
}
