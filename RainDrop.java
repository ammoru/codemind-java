
import java.util.Scanner ;
public class RainDrop{
    public static void main(String args []){
        Scanner input= new Scanner (System.in);
        int num= input.nextInt();
        int sum=0;
        if (num%3==0)
        {
            System.out.print("Pling");
            sum =1;
        }
         if (num%5==0)
        {
            System.out.print("Plang");
            sum = 1;
        }
        if (num%7==0)
        {
            System.out.print("Plong");
            sum = 1;
        }
        if(sum == 0){
            System.out.print(num);
        }
        
    
}}