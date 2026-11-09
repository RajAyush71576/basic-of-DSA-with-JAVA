import java.util.*;

public class Sorting{
    public static void bubbleSort(int array[]){
        for(int turn=0; turn<array.length-1; turn++){
            for(int j=0; j<array.length-1-turn; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }
        }
    }
    
    public static void selectionSort(int array[]){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(array[minPos] < array[j]){
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int array[]){
        for(int i=1; i<array.length; i++){
            int curr = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }

    public static void countingSort(int array[]){
        //find maximum element in array
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        //create count array
        int count[] = new int[max+1];
        //count occurrences
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }

        //re-build original array with respect to count array
        int index = 0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                array[index] = i;
                index++;
                count[i]--;
            }
        }

    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int array[] = {5,4,1,3,2};
        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        countingSort(array);
        printArray(array);
    }
}