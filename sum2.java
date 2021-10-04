import java.util.*;
class sum2
{
	 public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner s1=new Scanner(System.in);
	    System.out.println("Enter the number");
		n=s1.nextInt();
        while(i<=n)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		
		System.out.println("totalsum "+sum);
	}
}