import java.util.Scanner;
public class Pattern16{
    public static void main(String aregs [])
    {
       
       Scanner sc= new Scanner(System.in);
       int num= sc.nextInt();
       for(int i=1;i<num+1;i++)
       {
           for(int j=1;j<num+1;j++)
           {
               System.out.print(i+" ");
           }
           System.out.println();
       }
    }
}