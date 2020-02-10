import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Double a,b,c;
	    String operation;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first operand\n");
	    a=sc.nextDouble();
	    System.out.print("Enter second operand\n");
	    b=sc.nextDouble();
	    System.out.print("Enter type of operation in symbol like +,-,*,/ \n");
	    operation=sc.next();
		switch(operation)
		{
		    case "+": c=a+b;
		              System.out.print("Result is \t"+c);
		              break;
		    case "-": c=a-b;
		              System.out.print("Result is \t"+c); 
		              break; 
		          
		    case "*": c=a*b;
		              System.out.print("Result is \t"+c);
		              break;
		    case "/": c=a/b;
		              System.out.print("Result is \t"+c);
		              break;
		    default:  System.out.print("Invalid Operation");
		              break;
		              
		}
		    
	}
}