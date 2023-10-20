import java.util.Scanner;
public class palindrome{
   
static  int res(int n){
    int k=0,t=0;
    while(n!=0){
        
        int rem = n%10;
        k=k*10+rem;
        n/=10;
    }
    return k;
}
 public static void main(String args []){
     Scanner sc= new Scanner (System.in);
     int n= sc.nextInt();
     int re=res(n);
     System.out.println((n==re)?"True":"False");
 }
}
