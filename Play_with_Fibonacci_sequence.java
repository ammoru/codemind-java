import java.util.*;
public class Fabonacci{
    public static void main(String args []){
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int a=0,b=1;
        int sum=a+b;
        for (int i=0;i<num;i++)
        {
            System.out.print(a+" ");
            a=b;
            b=sum;
            sum=a+b;
            
        }
    }
}