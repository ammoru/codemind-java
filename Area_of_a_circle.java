import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float  num1=sc.nextFloat();
        double res= num1*num1*3.14;
        System.out.printf("%.2f",res);
    }
}