import java.util.Scanner ;
public class MaxOfString{
    public static void main(String args[]){
        Scanner sc= new Scanner ( System.in);
        String s= sc.nextLine();
        int max=0;
        for ( int i=0;i<s.length();i++)
        {
            max=Math.max(max,(int)s.charAt(i));
        }
        System.out.println((char)(max));
    }
}