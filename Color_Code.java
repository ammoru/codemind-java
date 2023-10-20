import java.util.*;
import java.util.Scanner;

public class  only {
    public static void main(String arsgs[]) {
    Scanner sc = new Scanner(System.in);
    char n= sc.next().toUpperCase().charAt(0);
    
    switch(n){
        case 'V':
            System.out.println("Violet");
            break;
        case 'I':
            System.out.println("Indigo");
            break;
        case 'B':
            System.out.println("Blue");
            break;
        case 'G':
            System.out.println("Green");
            break;
        case 'O':
            System.out.println("Orange");
            break;
        case 'R':
            System.out.println("Red");
            break;
        default:
            System.out.println("-1");
            break;    
        
    }
    }
}