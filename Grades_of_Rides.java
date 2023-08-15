import java.util.Scanner;
public class grade{
    public static void main(String arga [])
    {
        Scanner sc= new Scanner (System.in);
        int hurl=sc.nextInt();
        int spin=sc.nextInt();
        int speed = sc.nextInt();
        if (hurl>50 && spin>60 && speed >100)
        System.out.println(10);
        else if ( hurl>50 && spin>60)
        System.out.println(9);
        else if (spin>60 && speed >100)
        System.out.println(8);
        else if (hurl>50 && speed >100)
        System.out.println(7);
        
        else if(hurl>50|| spin>60 ||speed>100)
        System.out.println(6);
        else 
        System.out.println(5);
        
    }
}