import java.io.*;
class sum1
{
	public static void main(String args[])throws IOException
	{
      int a,b,sum;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter one number");
      a=Integer.parseInt(br.readLine());
      System.out.println("enter one number");
      b=Integer.parseInt(br.readLine());
      sum=a+b;
      System.out.println("Addition "+sum);

	}
}