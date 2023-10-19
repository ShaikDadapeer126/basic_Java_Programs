import java.util.Scanner;
public class perfect_square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a numbet to print it's square");
		int num = sc.nextInt();
		
		for(int i=num; i>=num ;i--) {
			System.out.println("perfect square of "+num+" is "+i*i);
		}
	}
}
