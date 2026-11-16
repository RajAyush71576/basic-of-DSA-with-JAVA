import java.util.*;

public class string{
    public static void main(String[] args){
        String str = "racecar";
        isPalindrome(str);
    }

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.print("string is not palindrome ");
                return false;
            }
        }
        System.out.print("String is palindrome ");
        return true;
    }
}