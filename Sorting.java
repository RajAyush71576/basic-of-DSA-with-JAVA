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

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int array[] = {5,4,1,3,2};
        // bubbleSort(array);
        selectionSort(array);
        printArray(array);
    }
}