import java.util.*;
public class Seasons{
    public static void main(String args []){
        Scanner sc= new Scanner (System.in);
        int num1=sc.nextInt();
        if(num1==4|| num1==5|| num1==6)
        System.out.println("Summer");
        else if(num1==7|| num1==8|| num1==9 ||num1==10)
        System.out.println("Rainy");
        else if(num1==11|| num1==12|| num1==1)
        System.out.println("Winter");
        else if(num1==2|| num1==3)
        System.out.println("Spring");
        else 
        System.out.println(-1);
    }
}