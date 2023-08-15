import java.util.Scanner;
public class ElectricityBill{
    public static void main (String args []){
        Scanner scan=new Scanner (System.in);
        String customer= scan.nextLine();
        String name=scan.nextLine();
        int units=scan.nextInt();
        double bill,exceed=0,charge=0;
        double total;
        if(units<199) charge=1.20;
        else if (units>=200 && units<400) charge=1.50;
        else if (units>=400 && units<600) charge=1.80;
        else if (units >=600) charge=2.00;
        bill=units*charge;
        if (bill>400)
        {
            exceed=bill*0.15;
            
        }
        else{
            exceed = 100;
        }
        total=bill+exceed;
        System.out.printf("%.2f",total);
    }
}