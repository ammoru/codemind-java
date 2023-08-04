import java.util.Scanner;
public class Handshakes
{
    public static void main (String [] agrs)
    {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println((num*(num-1))/2);
    }
}