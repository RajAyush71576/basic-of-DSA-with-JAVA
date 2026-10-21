import java.util.*;

public class MaxSum{

    public static void prefixSumSubArray(int array[]){
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i=1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<prefix.length; i++){
            int start = i;
            int currSum ;
            for(int j=i; j<prefix.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                 if(currSum > maxSum){
                maxSum = currSum;
                } 
            }
        }
        System.out.print(maxSum);
    }

    public static void kadane(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<array.length; i++){
            currSum += array[i];
            if(currSum < 0){
                currSum = 0;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }  
        }

        System.out.print(maxSum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        // prefixSumSubArray(array);
        kadane(array);
    }
}