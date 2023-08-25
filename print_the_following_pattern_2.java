import java.util.Scanner ;
public class Pattern2{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int num=sc.nextInt();
        for (int i=1;i<=num;i++)
        {
            for ( int j=i;j>=1;j--)
            {
                if (i==num)
                {
                    System.out.print("*"+"");
                }else{
                if  (j==1)
                {
                    System.out.print("*
");
                    
                }
                else if (j==i)
                {
                       System.out.print("*"+"");
                    }
                    else
                    {
                    System.out.print(" "+"");
                }
            }
            }
        }
    }
}