package Recursion;
public class palindrome {
    public static boolean checkPalindrome(int i, String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return checkPalindrome(i+1, s);
    }
    public static void main(String[] args) {
        boolean res= checkPalindrome(0,"QWEWQ");
        System.out.println(res);
    }
}
