import java.util.Scanner;
public class welcome{
    public static void main(String args []){
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int arr1[]=new int[num];
        int arr2[]=new int[num];
        int finalarr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            arr2[i]=sc.nextInt();
            finalarr[i]=arr1[i]+arr2[i];
        }
        for(int ele :finalarr)
        {
            System.out.print(ele+" ");
        }
    }
}