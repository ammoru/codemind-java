import java.util.Scanner;
public class FirstLastPosition{
    public static void main(String arhs[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for ( int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int first=0,second=0;
        int se=sc.nextInt();
         int flag=0;
        for( int i=0;i<num;i++)
        {
           
            if (se==arr[i])
            {
                first=i;
                break;
            }
            else
            {
                flag++;
            }
        }
        if(flag==num)
        {
            first=-1;
        }
        int flag2=0;
        for( int i=num-1;i>=0;i--)
        {
           
            if (se==arr[i])
            {
                second=i;
                break;
            }
            else
            {
                flag2++;
            }
        }
        if (flag2==num)
        {
            second=-1;
        }
        System.out.printf("%d %d",first,second);
    }
}