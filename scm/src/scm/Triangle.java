package scm;
import java.util.*;
public class Triangle 
{

	  public static void main(String[] args)
	  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter first side: a");
	  int a= sc.nextInt();
	  System.out.println("Enter second side: b");
	  int b= sc.nextInt();
	  System.out.println("Enter third side: c");
	  int c= sc.nextInt();
	  if(a+b>c && b+c>a && c+a>b)
	  System.out.println("Triangle can be formed");
	  else
	  System.out.println("Try other values");
	  }
}
