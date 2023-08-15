import java.util.Scanner;
public class equally{
    public static void main(String args [])
    {
        Scanner sc=new Scanner (System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();
        //int res=num1+(num2*2);
        if (num1%2==0 && (num1>0  || num2%2==0))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}