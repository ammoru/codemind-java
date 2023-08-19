import java.util.Scanner;
public class HalfDiamond{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>=3 && num<=100)
        {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
        for(int i=num - 1;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }else
        System.out.println("The pattern is not possible");
    }
}