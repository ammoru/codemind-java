import java.util.Scanner;
public class con
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      String num=sc.nextLine();
      System.out.println(Integer.parseInt(num,8));
    }
}