import java.util.Scanner;
public class climbing
{
    static int problem(int num1,int num2)
    {
        int sum=0;
        if (num1%num2!=0)
        {
            sum= num1/num2;
            sum+=num1%num2;
            return sum;
        }
        else
        {
            return (num1/num2);
        }
    }
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++)
        {
            int total=sc.nextInt();
            int maxsteps=sc.nextInt();
            System.out.println(problem(total,maxsteps));
        }
    }
}