import java.util.*;

public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = {1, -2, 6, -1, 3};
        int x = 8;
        // int result = linearSearch(array,x);
        // System.out.print(result);
        // largestAndSmallestNum(array); 
        // int result = binarySearch(array, x);
        // reverseArray(array);
        // for(int i=0; i<array.length; i++){
        //     System.out.print(array[i]);
        // }
        // pairsArray(array);
        // subArray(array);
        maxSubArray(array);
    }

    public static int linearSearch(int array[],int x){
        for(int i=0; i<array.length; i++){
            if(array[i] == x){
                return i;
            }
        }
        
        return -1;
    }

    public static void largestAndSmallestNum(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.print(largest +" "+ smallest);
    }

    public static int binarySearch(int array[], int x){
        int start = 0, end = array.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == x){
                return mid;
            }else if(x < array[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void reverseArray(int array[]){
        int start = 0 , end = array.length-1;
        int temp = 0;
        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void pairsArray(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("("+array[i] + ", " + array[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArray(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(array[k]+",");
                }
                System.out.println();
            }
        }
    }
    public static void maxSubArray(int array[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += array[k];
                    if(maxSum < currSum){
                        maxSum = currSum;
                    }
                }
            }
        }

        System.out.print(maxSum);
    }  
}