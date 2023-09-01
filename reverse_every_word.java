import java.util.Scanner;
public class ReverseEveryWord{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String s=sc.nextLine();
        String [] sarr= s.split(" ");
        for ( int i=0; i<sarr.length;i++)
        {
            String snew="";
            for (int j=sarr[i].length()-1;j>=0;j--)
            {
                snew+=sarr[i].charAt(j);
            }
            System.out.print(snew+" ");
        }
    }
}