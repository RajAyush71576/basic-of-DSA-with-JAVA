import java.util.*;

public class string{
    public static void main(String[] args){
        String str = "racecar";
        isPalindrome(str);
        System.out.println();

        //given a route containing 4 direction (E,W,N,S), find the shortest path to reach destination.
        String str_dir = "WNEENESENNN";
        System.out.print(shortestPath(str_dir));
        System.out.println();

        //for sub String
        substring(str, 1, 4);
        System.out.println();
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

    public static float shortestPath(String str){
        int X = 0;
        int Y = 0;

        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                X++;
            }else if (dir == 'W'){
                X--;
            }else if (dir == 'N'){
                Y++;
            }else {
                Y--;
            } 
        }

        int X2 = X*X;
        int Y2 = Y*Y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void substring(String str, int st, int end){
        String subStr = "";
        for(int i=st; i<end; i++){
            subStr += str.charAt(i);
        }
        System.out.print(subStr);
    }
}