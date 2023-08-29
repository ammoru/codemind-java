import java.util.Scanner;
public class Airport {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
       int n= sc.nextInt();
       int []arr= new int[n];
       for (int i=0;i<n; i++){
           arr[i]= sc.nextInt();
       }
       int t=sc.nextInt();
       int cnt=0;
       for (int ele : arr)
       if (ele<=t) cnt++;
       else cnt+=2;
       
       System.out.println(cnt);
    }
}