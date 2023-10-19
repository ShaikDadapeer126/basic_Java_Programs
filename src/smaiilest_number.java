import java.util.*;
public class smaiilest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers to check smaller number");
		
		System.out.println("number 1 = ");
		int num1=sc.nextInt();
		
		System.out.println("number 2 = ");
		int num2=sc.nextInt();
		
		System.out.println("number 3 = ");
		int num3=sc.nextInt();
		
		System.out.println("number 4 = ");
		int num4=sc.nextInt();
		
		String result = num1<num2 && num1<num3 && num1<num4 ? num1+" is smallest" : 
			num2<num3 && num2<num4 ? num2+" is smallest" : num3<num4 ? num3+" is smallest" :
				 num4+" is smallest";
		
		System.out.println(result);
	}
}
