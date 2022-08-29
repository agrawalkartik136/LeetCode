//https://leetcode.com/problems/roman-to-integer/

import java.util.*;
public class RomanToInteger{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string in roman");
        String str=in.next();
        Leetcode2 ob=new Leetcode2();
        int res=ob.romanToInt(str);
        System.out.println(res);
    }
}
class Leetcode2 {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            int s1=value(s.charAt(i));
            if(i+1<s.length())
            {
                int s2=value(s.charAt(i+1));
                if(s1>=s2)
                    total=total+s1;
                else
                    total=total-s1;
            }
            else
                total=total+s1;
        }
        return total;
    }
    int value(char c)
    {
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        if(c=='M')
            return 1000;
        else
            return -1;
    }
}