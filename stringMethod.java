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

        //for a given set of strings, print the largest string
        String fruits[] = {"apple", "bananna", "mango"};
        String largestFruit = fruits[0];
        
        for(int i=1; i<fruits.length; i++){
            if(largestFruit.compareToIgnoreCase(fruits[i]) < 0){
                largestFruit = fruits[i];
            }
        }

        System.out.print(largestFruit);
    }
}