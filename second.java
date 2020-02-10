import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a\n");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.print(a);
        }
        else
        {
           b=1;
            for(int i=1;i<=a;i++)
            {
                System.out.print(b);
	            b=b+2;
	            System.out.print("\t");
            }
        }
	}
}