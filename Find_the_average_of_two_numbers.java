import java.util.Scanner;
public class Avg
{
    public static void main (String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
       double num3=(float)(num1+num2)/2;
        System.out.printf("%.4f",num3);
    }
}