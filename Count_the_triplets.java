import java.util.ArrayList;
import java.util.Scanner ;
public class gfg{
    static void fun(int arr[]){
        boolean ans=false;
        int cnt=0;
        ArrayList<Integer > l= new ArrayList<>();
        for(int ele:arr){
            l.add(ele);
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                int num=arr[i]+arr[j];
                if (i==j) continue;
                

                if( l.contains(num)){
                    //System.out.println(num);
                    cnt++;
                }
            }
        }
        if (cnt==0){
            System.out.println(-1);
        }
        else
        System.out.println(cnt/2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        while(n-- >0){
            int s=sc.nextInt();
            int arr[]=new int [s];
            for( int i=0;i<s;i++){
                arr[i]=sc.nextInt();
            }
            fun(arr);
        }
    }
}