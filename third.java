import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a\n");
        a=sc.nextInt();
        
            for(int i=0;i<=a;i++)
            {
                if((i%2)!=0)
                {
                    System.out.print(i);
                    System.out.print("\t");
                }
            }
        
	}
}