import java.util.Scanner ;
public class check{
    public static void main(String args []){
        Scanner input= new Scanner (System.in);
        
         String ch1=input.nextLine();
         char ch=ch1.charAt(0);
         
         if (ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'|| ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U')
         {
             System.out.println("Vowel");
         }
         else
         {
             System.out.println("Consonant");
         }
    
}}