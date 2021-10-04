import java.util.*;
class reversenumber
{
	 public static void main(String[] args) {
		int n,rev=0;
		Scanner s1=new Scanner(System.in);
	    System.out.println("Enter the number to find reverse:");
		n=s1.nextInt();
        while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		
		System.out.println("reverse number: "+rev);
	}
}