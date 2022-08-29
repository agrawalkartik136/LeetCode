//https://leetcode.com/problems/palindrome-number/submissions/

import java.util.*;
public class PalindromeNumber{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        Leetcode1 ob=new Leetcode1();
        System.out.println(ob.isPalindrome(n));
    }}
class Leetcode1 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rev=0,temp;
        temp=x;
        while(temp!=0)
        {
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        return x == rev;
    }
}
