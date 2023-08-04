import java.util.Scanner;
public class Capacity
{
    public static void main (String[] args)
    {
    Scanner sc= new Scanner(System.in);
    int tracks=sc.nextInt();
    int sectors=sc.nextInt();
    int blocks=sc.nextInt();
    System.out.println(2*tracks*sectors*blocks*512);
    }
}