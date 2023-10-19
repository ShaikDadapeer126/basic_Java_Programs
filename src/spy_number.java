import java.util.*;
public class spy_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check = ");
		int num = sc.nextInt();
		
		int prod =1;
		int sum=0;
		int last;
		
		while(num>0) {
			last=num%10;
			sum=sum+last;
			prod=prod*last;
			num=num/10;
		}
		if(sum==prod) {
			System.out.println("SPY number");
		}else {
			System.out.println("not a SPY number");
		}
	}
}
