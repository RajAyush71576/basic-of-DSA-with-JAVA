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

        //for a given String convert each the first letter of each word to uppercase.
        String sentence = "hi, i am ayush";
        System.out.println(toUpperCase(sentence));

        //String compression ex- "aaabbcccdd" => "a3b2c3d2"
        String decompress_str = "aaabbcccdd";
        System.out.println(compress(decompress_str));//O(n)
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

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(count.toString());
            }
        }

        return newStr.toString();
    }
}