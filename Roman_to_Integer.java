import javax.swing.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class  only {
    public static void main(String arsgs[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String s= sc.next();
        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.length()==1) System.out.println(map.get(s.charAt(0)));

            if ( (i+1 )< s.length() && map.get(s.charAt(i))< map.get(s.charAt(i+1)) )
            {
                sum-=map.get(s.charAt(i));
            }else {
                sum+=map.get(s.charAt(i));
            }

        }
        System.out.println(sum);
    }
}