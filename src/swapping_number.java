
public class swapping_number 
{
public static void main(String[] args) {
	int a=10, b=20;
	System.out.println("before Swapping a = "+a+" b = "+b);
	
//	by using 3rd variable -->
//	int temp=a;
//	a=b;
//	b=temp;
	
//	without using 3rd variable -->
	a=a*b;
	b=a/b;
	a=a/b;
	
	System.out.println("After Swapping a = "+a+" b = "+b);
}
}
