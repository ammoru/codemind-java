import java.util.Scanner;
public class DisplayUnique{
    public static void main(String args []){
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int arr[]=new int [num];
        int arr1[]=new int[num];
        int k=0,count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            int flag=0;
            for( int j=0;j<num;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    flag=1;
                }
            }
            if( flag==0)
            {
                arr1[k++]=arr[i];
                count++;
            }
        }
        for(int ele:arr1)
        {
            if(ele!=0)
            System.out.print(ele+" ");
        }if(count==0)
        {
            System.out.println(-1);
        }
    }
}