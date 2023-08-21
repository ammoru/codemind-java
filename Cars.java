import java.util.Scanner ;
public class Cars{
   public static void main(String args [])
   {
       Scanner sc= new Scanner (System.in);
       int n1=sc.nextInt();
       int n2= sc.nextInt();
       int x= sc.nextInt();
       int i=1,sec=0;
       if (n1>n2)
       {
           System.out.println(-1);
       }
       //int res=n1+x;
       while(n2>n1)
       {
           n1=n1*i;
           n2=n2*i;
           sec++;
           if(n2>n1+x)
           {
               System.out.println(sec);
               break;
           }
           i++;
       }
   }
}