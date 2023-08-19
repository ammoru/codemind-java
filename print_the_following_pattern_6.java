import java.util.Scanner;
public class HalfDiamond{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int num= sc.nextInt();
        for (int i=num;i>0;i--)
        {
         for (int j=num;j>0;j--)
         {
             System.out.print(j+" ");
         }
         System.out.println();
        }
        
    }

}