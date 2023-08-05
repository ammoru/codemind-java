import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        float num2= sc.nextFloat();
        float num3= sc.nextFloat();
        double s=(num1+num2+num3)/2;
        double result=Math.sqrt(s*(s-num1)*(s-num2)*(s-num3));
        System.out.printf("%.2f",result);
    }
}