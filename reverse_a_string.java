import java.util.Scanner;
public class ReverseString{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr= s.toCharArray();
        char[] res= new char[s.length()];
        int k=0;
        for ( int i=s.length()-1;i>=0;i--)
        {
            res[k++]=s.charAt(i);
        }
        String result=new String(res);
        System.out.println(result);
    }
}