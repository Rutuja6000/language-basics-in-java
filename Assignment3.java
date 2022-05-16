import java.util.Scanner;
       public class CommandLineArguments{
	
	    public static void main(String []args)
	  {
		Scanner sum=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		int a=sum.nextInt();
		int b=sum.nextInt();
		int s=a+b;
		System.out.println("sum of "+a+" and "+b+" is" +s);
	 }
}
		
		
