import java.util.*;
class calculatorswitch
{
	 public static void main(String[] args) {
		int a,b,ch;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter one number");
		a=s1.nextInt();
		System.out.println("Enter second number");
		b=s1.nextInt();
	    System.out.println("Enter your choice number ->1 Add, ->2 Sub, ->3 Mul, ->4 Div \n Enter your choice:");
	    ch=s1.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition "+(a+b));
		      break;
		case 2:
		
			System.out.println("Subtation "+(a-b));
		     break;
		case 3:
		
			System.out.println("Multification "+(a*b));
		     break;
		case 4:
			System.out.println("Division "+(a/b));
		     break;
		default:
		     System.out.println("Invalid number");
		}
	}
}