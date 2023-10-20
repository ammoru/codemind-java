import java.util.*;
import java.util.Scanner;

public class  only {
    
    public static void main(String arsgs[]) {
    Scanner sc = new Scanner(System.in);
     String n= sc.next();
     int x= sc.nextInt();
     String f="",l="";
     for (int i=0;i<x;i++)
     {
         f+=n.charAt(i);
     }
     for (int i=n.length()-x;i<n.length();i++)
     {
         l+=n.charAt(i);
     }
     System.out.println(Math.abs(Integer.parseInt(f)-Integer.parseInt(l)));
    }
}