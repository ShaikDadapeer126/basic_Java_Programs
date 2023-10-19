import java.util.Scanner;
public class eligible2_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check your eligibility for Army here");
		
		System.out.print("Age = ");
		int age = sc.nextInt();
		
		System.out.print("Height = ");
		int height = sc.nextInt();
		
		System.out.print("Weight = ");
		int weight = sc.nextInt();
		
		if(age >=18 && height>=5&& weight<=60) {
			System.out.println("Your eligible for Army");
		}else {
			System.out.println("Your Not eligible for Army");

		}
	}
}
