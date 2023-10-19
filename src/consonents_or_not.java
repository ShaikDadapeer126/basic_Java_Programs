//by using scanner class  -->
import java.util.*;
public class consonents_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Aplabet");
		char ch =sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println(ch+" is a vowels");
		}else {
			System.out.println(ch+" is a consonant");
		}
	}
}



// without using scanner class  -->
//char ch = 'i';
//
//if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
//		ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//	System.out.println(ch+" is a vowels");
//}else {
//	System.out.println(ch+" is a consonant");
//}