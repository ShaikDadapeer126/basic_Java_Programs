import java.util.*;
public class speacalchar_vowel_consonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Alphabet or a character to check");
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println(ch+" is a vowels");
		}else if(ch=='@' || ch=='!' || ch=='#' || ch=='$' || ch=='&'){
			System.out.println(ch+" is a special character");
		}else {
			System.out.println(ch+" is a consonant");
		}
	}
}
