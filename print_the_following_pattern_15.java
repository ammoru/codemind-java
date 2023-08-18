import java.util.Scanner;
public class Pattern15{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int r=0;
        for (int i=65+num-1;i>=65;i--)
        {
            for (int j=num-r;j>0;j--)
            System.out.print(((char)i )+" ");
            System.out.println();
            r++;
        }
        //System.out.println();
    }
}