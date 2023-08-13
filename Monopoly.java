import  java.util.Scanner;
public class Monopoly
{
    static void funMonopoly(int r1,int r2, int r3)
    {
       if ((r1+r2)<r3 || (r1+r3)<r2 || (r2+r3)<r1)
       {
           System.out.println("YES");
       }
       else 
       {
           System.out.println("NO");
       }
    }
    public static void main(String args [])
    {
        Scanner scan=new Scanner (System.in);
        int testCase=scan.nextInt();
        for(int i=0;i<testCase;i++)
        {
          int r1= scan.nextInt();
          int r2= scan.nextInt();
          int r3=scan.nextInt();
          funMonopoly(r1,r2,r3);
        }
    }
}