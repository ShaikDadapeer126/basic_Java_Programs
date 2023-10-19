import java.util.*;
public class reverse_number_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to reverse");
		int num=sc.nextInt();
		int sum=0;
		int last;
		
		while(num>0) {
			last=num%10;
			sum=(sum*10)+last;
			num=num/10;
		}
		System.out.print(sum);
		
	}
}
