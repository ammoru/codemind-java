import java.util.*;
public class MaxOfString{
    public static void main(String args[]){
        Scanner sc= new Scanner ( System.in);
        String s= sc.next();
        String s2= sc.next();
        char res[]=(s+s2).toCharArray();
        Arrays.sort(res);
        
        for ( int i=0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
        //System.out.println(f);
    }
}