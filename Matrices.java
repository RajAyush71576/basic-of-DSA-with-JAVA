import java.util.*;

public class Matrices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //2D_Array creation
        int matrices[][] = new int[3][3];
        int n = matrices.length; int m = matrices[0].length;

        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrices[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrices[i][j] + " ");
            }
            System.out.println();
        }
        
        search(matrices, 7);
        largest(matrices);
        smallest(matrices);
    }

    public static boolean search(int matrices[][] , int key){
        for(int i=0; i<matrices.length; i++){
            for(int j=0; j<matrices[0].length; j++){
                if(matrices[i][j] == key){
                    System.out.print("key found at"+ "(" + i +" ," + j + " )");
                    System.out.println();
                    return true;
                }
            }
        }

        System.out.print("key not found");
        return false;
    }

    public static void largest(int matrices[][]){
        int max = Integer.MIN_VALUE;
        int n = 0; int m = 0;
        for(int i=0; i<matrices.length; i++){
            for(int j=0; j<matrices[0].length; j++){
                if(matrices[i][j] > max){
                    max = matrices[i][j];
                    n = i;
                    m = j;
                }
            }
        }
        System.out.print("largest value "+ max + " at index " + n+","+m);
        System.out.println();
    }

    public static void smallest(int matrices[][]){
        int min = Integer.MAX_VALUE;
        int n = 0; int m = 0;
        for(int i=0; i<matrices.length; i++){
            for(int j=0; j<matrices[0].length; j++){
                if(matrices[i][j] < min){
                    min = matrices[i][j];
                    n = i;
                    m = j;
                }
            }
        }
        System.out.print("smallest value " + min + " at index " + n+","+m);
        System.out.println();
    }
}