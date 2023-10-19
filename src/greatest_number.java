import java.util.Scanner;
public class greatest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers to check Greatest number");
		
		System.out.println("number 1  = ");
		int num1 = sc.nextInt();
		
		System.out.println("number 2  = ");
		int num2 = sc.nextInt();
		
		System.out.println("number 3  = ");
		int num3 = sc.nextInt();
		
		System.out.println("number 4  = ");
		int num4 = sc.nextInt();
		
		String Greatest_Number = num1>num2 && num1>num3 && num1>num4 ? num1+" is greatest":
			num2>num3 && num2>num4 ? num2+" is greatest ": num3>num4 ? num3+" is greatest"
					: num4+" is greatest";
			
		System.out.println(Greatest_Number);	
			
	}
}
