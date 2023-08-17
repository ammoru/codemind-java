
import java.util.*;
public class NextPalindrome{
    
    static boolean check(int Num){
        int rem,sum=0;
        int temp=Num;
        while(Num>0)
        {
            rem=Num%10;
            sum=(sum*10)+rem;
            Num/=10;
        }
        if( temp==sum)
        return true;
        else
        return false;
    }
    static boolean prime(int prime_num)
    {
        int su=0;
        for (int i=1;i<=prime_num;i++)
        {
            if (prime_num%i==0)
            {
            su++;
            }
        }
        if (su==2)
        {
            return true;
        }
        else
        return false;
    }
    
    static int fun(int i)
    {
    
        if(prime(i) && check(i))
        return i;
        else
        return fun(i+1);
    }
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        System.out.println(fun(num+1));

    }
}