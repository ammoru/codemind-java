import java.util.Scanner ;
public class MaxOfString{
    public static void main(String args[]){
        Scanner sc= new Scanner ( System.in);
        String s= sc.nextLine();
        int c=0;
        for ( int i=0;i<s.length();i++)
        {
            int k=(int)s.charAt(i);
            if (k>=48 && k<=57)
            {
                c++;
            }
        }
        if ( c==0)
        System.out.println("Doesn't contain digit");
        else
        System.out.println("Contains "+c+" digit");
    }
}