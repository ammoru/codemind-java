import java.util.Scanner;
public class patter5{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int num= sc.nextInt();
        for (int i=1;i<=num;i++)
        {
         for (int j=1;j<=num;j++)
         {
         if (j==i)
         {
             System.out.print(0);
         }
         else
         System.out.print("x");
        }
        System.out.println();
    }
}}