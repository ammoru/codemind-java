import java.util.Scanner;
public class FindEvenDigit{
    static boolean fun(int num){
        int c=0,sum=0,res=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            res=(res*10)+rem;
            c++;
            num/=10;
        }
        return c%2==0;
    }
    public static void main(String arga []){
        Scanner sc= new Scanner (System.in);
        int num= sc.nextInt();
        int dem=0;
        int array[]= new int[num];
        for ( int i=0;i<num ;i++){
            array[i]=sc.nextInt();
        }
        for (int ele: array)
        {
            if (fun(ele))
            {
                dem++;
            }
        }
        System.out.println(dem);
}}