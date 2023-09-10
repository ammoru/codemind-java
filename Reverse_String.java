import java.util.Scanner ;
public class  ReverseString {
    public static void main(String args[]){
        Scanner sc= new Scanner ( System.in);
        String s= sc.nextLine();
        StringBuilder bg = new StringBuilder(s);
        System.out.println(bg.reverse());
        
    }
}