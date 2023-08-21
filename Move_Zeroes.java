import java.util.Scanner;
public class Zeroes{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            if (arr[i] == 0) {
                int j = i + 1;
                
                while(j < n - 1){
                    if (arr[j] != 0){
                        break;
                    }
                    if(arr[j] == 0 ){
                    j++;}
                    
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}