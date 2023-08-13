import java.util.Scanner;
public class OctToBin
{
    static void OctToBinary(String OctS)
    {
        int dec_int=Integer.parseInt(OctS,8);
        String octS1=Integer.toBinaryString(dec_int);
        System.out.println(octS1);
    }
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++)
        {
            String OctStr=sc.next();
            OctToBinary(OctStr);
        }
        
    }
}