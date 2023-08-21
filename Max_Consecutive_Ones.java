import java.util.Scanner;
public class MaxConsecutuveOnes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        int max=0;
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int ele:arr)
        {
            if (ele-1==0)
            {
                cnt++;
                max= max>cnt?max:cnt;
            }
            else
            {
                cnt=0;
            }
        }
        System.out.println(max);
    }
}