import java.util.*;

public class Assignment{
    public static void main(String[] args){
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // int nums[] = {1,2,3,4};
        // boolean result = containsDuplicate(nums);
        int array[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = rotatedSortedArray(array, target);
        System.out.print(result);
    }

    public static boolean containsDuplicate(int nums[]){
        int num;
        for(int i=0; i<nums.length; i++){
            num = nums[i];
            int counter = 0;
            for(int j=0; j<nums.length; j++){
                if(num == nums[j]){
                    counter ++;
                }
            }
            if(counter >= 2){
            return true;
            }
        }
        return false;
    }

    public static int rotatedSortedArray(int array[], int target){
        int st = 0;
        int end = array.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[st] <= array[mid]){
                if(target >= array[st] && target < array[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(target > array[mid] && target <= array[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}