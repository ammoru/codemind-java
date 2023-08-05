import java.util.Scanner;
public class Temp
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner ( System.in);
        float num1=sc.nextFloat();
        double res= (num1*9/5)+ 32;
        System.out.printf("%.2f",res);
    }
}