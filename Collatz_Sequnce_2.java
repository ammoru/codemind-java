import java.util.Scanner;
public class CollatzSequnce2 {
    static int fun(int n)
    {
        int m=0,c=0;
        while(n!=1)
        {
            if (n%2==0)
            {
                n=n/2;
                c++;
            }else
            {
                n=3*n+1;
                c++;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     int m=0;
     int ma = 1;
        for (int i = a; i <= b; i++) {
            if (fun(i)>=m) {
                m = fun(i);
                ma = i;
            }

        }
        System.out.println(ma);
    }
}
