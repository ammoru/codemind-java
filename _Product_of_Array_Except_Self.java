import java.util.Scanner;
public class product{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int arr2[]=new int[num];
        for (int i=0;i<num;i++)
        {
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            int sum=1;
            for(int j=0;j<num;j++)
            {
                if (i==j)
                {
                    continue;
                }
                sum=sum*arr[j];
           
            }
            
            arr2[i]=sum;
        }
         for ( int ele:arr2)
         {
             System.out.print(ele+" ");
         }
    }
}