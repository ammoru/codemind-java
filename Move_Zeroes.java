import java.util.Scanner;
public class movezoes {
    public static void main(String arha []){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int arr[]=new  int[num];

        for ( int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<num-1;i++)
        {
           
            if (arr[i]==0)
            {
                int j=i+1;
                while(j<num-1){
                    
                if(arr[j]!=0)
                {
                    break;
                }
                if(arr[j]==0)
                {
                    j++;
                }
                }
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        
    }
}