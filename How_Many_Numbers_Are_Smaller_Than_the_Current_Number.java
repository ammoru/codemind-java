import java.util.Scanner;
public class SmallNumsThenCurretNum{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int array1[]= new int[num];
        int array2[]= new int[num];
        int index=0;
        for (int i=0;i<num;i++)
        {
            array1[i]=sc.nextInt();
        }
        for (int i=0;i<num;i++)
        {
            int count=0;
            for(int j=0;j< num ; j++)
            {
                if (i==j)
                {
                    continue;
                }
                if(array1[i]>array1[j])
                {
                    count++;
                }
            }
            array2[index]=count;
            index++;
        }
        for (int ele:array2)
        {
            System.out.print(ele+" ");
        }
    }
}