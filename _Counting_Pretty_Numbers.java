import java.util.*;
public class pretty{
    static void check(int num1,int num2)
    {
        int count=0;
        for (int i=num1;i<=num2;i++)
        {
            if (i%10==2 || i%10==3 || i%10==9)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args []){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        for(int i=0;i<num;i++){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            check(num1,num2);
        }
        
    }
}