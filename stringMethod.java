import java.util.*;

public class stringMethod{
    public static void main(String[] args){
        String str = "ayush";
        String str_2 = "ayush";
        String str_3 = new String("ayush");

        if(str.equals(str_3)){
            System.out.print("strings are equal");
        }else{
            System.out.print("strings are not equal");
        }//.equals() compares the values of string

        if(str == str_3){
            System.out.print("strings are equal");
        }else{
            System.out.print("strings are not equal");
        }

        if(str == str_2){
            System.out.print("strings are equal");
        }else{
            System.out.print("strings are not equal");
        }

        //an method for converting any object into string but variable should be a object class
        Integer num = 9;
        num.toString();
        System.out.print(num);

        //for a given set of strings, print the largest string
        String fruits[] = {"apple", "bananna", "mango"};
        String largestFruit = fruits[0];
        
        for(int i=1; i<fruits.length; i++){
            if(largestFruit.compareToIgnoreCase(fruits[i]) < 0){
                largestFruit = fruits[i];
            }
        }

        System.out.print(largestFruit);

        //without string builder there is no change in string possible by this loop its time complexity is worse O(nxm), always copy the previous string n times. 
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }//but now with string builder O(n).
        System.out.print(sb);
    }
}