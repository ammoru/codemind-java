
import java.util.Scanner;
public class binaryToOct
{
    static void  fun(String str)
    {
        int dec_num= Integer.parseInt(str,2);
        String oct_str=Integer.toOctalString(dec_num);
        System.out.println(Integer.parseInt(oct_str));
    }
    
    public static void main (String args [])

    {
        Scanner sc= new Scanner(System.in );
        int it=sc.nextInt();
        for(int i = 0;i < it; i++){
            String BinaryString=sc.next();
            
            fun(BinaryString);
        }
    
    }
}