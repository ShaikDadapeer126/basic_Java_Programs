import java.util.*;
public class upper_lowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Something to check");
		String name = sc.next();
		if(name==name.toLowerCase()) {
			System.out.println(name+" is in Lower Case");
		}else {
			System.out.println(name+" is in upper case");
		}
	}
}
