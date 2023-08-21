import java.util.Scanner ;
public class searchRotatedArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num= sc.nextInt();
        int arr[]= new int [num];
        for( int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sec=sc.nextInt();
        int flag=0;
        for ( int i=0;i<num;i++)
        {
            if ( sec==arr[i])
            {
            System.out.println(i);
            }else
            flag++;
        }
        if(flag==num)
        System.out.println(-1);
    }
}