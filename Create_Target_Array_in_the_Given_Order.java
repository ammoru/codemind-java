
    import javax.xml.transform.stax.StAXSource;
    import java.util.ArrayList;
    import java.util.Scanner ;
    public  class demo2{
        public static void main(String args[])
        {
            Scanner sc= new Scanner (System.in);
            int n= sc.nextInt();
            int nums[]=new int[n];
            int res[]=new int[n];
            for (int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            int n2=sc.nextInt();
            int ind[]=  new int [n2];
            for(int i=0;i<n2;i++)
            {
                ind[i]=sc.nextInt();
            }
            ArrayList <Integer> list=new ArrayList<>();
            for (int i=0;i<n;i++)
            {
                list.add(ind[i],nums[i]);
            }
            //System.out.println(list);
            for(Integer ele: list)
            {
                System.out.print(ele+" ");
            }
        }
    }
