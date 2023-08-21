import java.util.Scanner ;
public class ReplaceGER{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int arr[]= new int [ num];
        int arr2[]= new int [num];
        
        for ( int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for ( int i=0;i<num;i++)
        {
            if (i==num-1)
            {
                arr2[i]=-1;
                break;
            }
            int max=0;
            for(int j=i+1;j<num;j++)
            {
                max=max>arr[j]?max:arr[j];
            }
            arr2[i]=max;
        }
        for ( int ele:arr2)
        {
            System.out.print(ele+" ");
        }
    }
}