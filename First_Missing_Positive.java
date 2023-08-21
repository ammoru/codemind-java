import java.util.*;
public class FirstMissingPositive{
    public static void main(String arhs []){
        Scanner sc= new Scanner( System.in);
        int num= sc.nextInt();
        int  arr[]= new int[num];
        for ( int i=0;i<num ;i++)
        {
        arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[num-1];
        
        for(int i=1;i<max+5;i++)
        {
            int flag=0;
            for (int j=0;j<num;j++)
            {
                if( i==arr[j])
                {
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                System.out.print(i+" ");
                break;
            }
        }
        
    } 
} 