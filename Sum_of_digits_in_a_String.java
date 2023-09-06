import java.util.Scanner ;
public class sumOfDigits{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            int k=(int)s.charAt(i);
            if ( k>=48 && k<=57)
            {
                sum+=Integer.parseInt(""+s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}