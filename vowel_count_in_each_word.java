import java.util.Scanner ;
public class vowelsInString{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        String s= sc.nextLine();
        String s2="AEIOUaeiou";
        String arr[]=s.split(" ");
        
        
        for ( int j=0;j<arr.length;j++){
            int cnt=0;
        for ( int i=0;i<arr[j].length();i++){
            if (s2.contains(arr[j].charAt(i)+"")){
                cnt++;
            }
         
        }
         System.out.print(cnt+" ");
        }
         
    }
}