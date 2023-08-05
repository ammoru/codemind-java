import java.util.Scanner;
public class floatTwoNum
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      float num=sc.nextFloat();
      float num2=sc.nextFloat();
      System.out.printf("%.2f",num*num2);
    }
}