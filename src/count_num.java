import java.util.*;
public class count_num {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Starting number = ");
	int m = sc.nextInt();
	
	System.out.print("Ending number = ");
	int n= sc.nextInt();
	
	int count=0;
	
	for(int i=m;i<n;i++){
		if(i%3==0 && i%7==0) {
			count++;
		}
	}
	System.out.println(count);
}
}
