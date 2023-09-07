import java.util.Scanner ;
public class vowelsInString{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String s= sc.nextLine();
        String arr[]= s.split(" ");
        int sum=0;
        for ( int i=0;i<arr.length;i++){
            sum+=arr[i].length();
        }
        System.out.println(sum);
    }
}