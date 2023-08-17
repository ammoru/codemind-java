import java.util.*;
public class Nextpal{
    static boolean isprime(int num)
    {
        int c=0;
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    static boolean ispalindrome(int num)
    {
        int temp=num,res=0,t;
        
        while(num>0)
        {
            t=num%10;
            res= res*10 +t;
            num/=10;
        }
        return temp==res;
    }
    static void fun(int num){
    while (true)
    {
        if( isprime(num) && ispalindrome(num))
        {
            System.out.println(num);
            break;
        }
        num++;
    }
    }
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        fun(num+1);
    }
}