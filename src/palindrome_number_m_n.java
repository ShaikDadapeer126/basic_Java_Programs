import java.util.*;
public class palindrome_number_m_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numbers to print palindrom numbers from M to N");
		
		System.out.print("Start = ");
		int m = sc.nextInt();
		
		System.out.print("End = ");
		int n = sc.nextInt();
		
		for(int i=m;i<n;i++) {
			int num = i;
			int rev=0;
			while(m>0) {
				int last = num%10;
				rev = (rev*10)+last;
				num = num/10;{
					if(i==rev) {
						System.out.println("Palindrome numbers from "+m+" to "+n+" = "+rev);
					}
				}
			}
		}
	}
}
