import java.util.Scanner;
public class table{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int num=sc.nextInt();
        int s=sc.nextInt();
        for ( int i=1 ;i<=s;i+=2)
        {
            System.out.println(num +" x " + i +" = " +num*i);
        }
    }
}
