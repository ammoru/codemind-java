import java.util.Scanner ;
public class DigitsContains{
    public static void main(String args[]){
        Scanner sc= new Scanner (  System.in);
       String s=sc.nextLine();
       String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
          for ( int j=arr[i].length()-1;j>=0;j--){
              System.out.print(arr[i].charAt(j)+"");
          }
          System.out.print(" ");
        }
        
    }
}