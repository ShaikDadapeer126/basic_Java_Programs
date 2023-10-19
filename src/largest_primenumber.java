//import java.util.Scanner;
public class largest_primenumber {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		for(int i=1000;i>=1;i--) {
			int num=1;
			int count = 0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
				if(count==2) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
