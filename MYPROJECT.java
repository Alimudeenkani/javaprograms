package javaproject;
import java.util.Scanner;



public class MYPROJECT {
	
	public static void main(String[] deen)
	{
      int x,y;
      Scanner obj=new Scanner(System.in);
      System.out.println("enter the first number(x)");
      x=obj.nextInt();
      System.out.println("enter the second number(y)");
      y=obj.nextInt();
       int add=x+y;
       int sub=x-y;
       int mul=x*y;
       int div=x/y;
       int per=x%y;
      
	System.out.println(x<y);
	System.out.println(x>y);
	System.out.println(x=y);
	System.out.println(x<=y);
	System.out.println(x>=y);
	obj.close();
}
}

