import java.util.*;
public  class duplicate{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]= new int [num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag = 0;
        for( int i=0;i<num;i++)
        {
            for ( int j=0;j<num;j++)
            {
                if (i==j)
                {
                    continue;
                }
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    flag = 1;
                    break;
                }
            }
            if ( flag == 1){
                break;
            }
        }
    }
}