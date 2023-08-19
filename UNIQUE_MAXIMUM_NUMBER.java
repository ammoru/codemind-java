import java.util.Scanner;
public class UniqueMax{
    public static void main(String args []){
        
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int Intarray[]=new int[num];
    int array2[]=new int[num];
    int index=0;
    for (int i=0;i<Intarray.length;i++){
        Intarray[i]=sc.nextInt();
    }
    
    for(int i=0;i<num;i++){
        int con=0;
        for (int j=0;j<num;j++)
        {
            if (i==j){
                continue;
            }
            if (Intarray[i]==Intarray[j])
            {
                con=1;
                break;
            }
        }
        if(con==0)
        {
            array2[index]=Intarray[i];
            index++;
        }
        
    }
    int max=array2[0];
    for(int i=0;i<array2.length;i++)
    {
        
        if(max< array2[i])
        {
            max=array2[i];
        }
    }
   
    if(array2[0]==0)
    {System.out.println(-1);}
    else
    System.out.print(max);
    }
    
}