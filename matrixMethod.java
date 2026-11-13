public class matrixMethod{
    public static void main(String[] args){
        int matrix_even[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int matrix_odd[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;

        diagnalSum(matrix_even);
        diagnalSum(matrix_odd);
        stairChaseSearch(matrix, key);
    }

    //only for n=m matrix
    public static void diagnalSum(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            //diagonal i=j
            sum += matrix[i][i];

            //diagonal i+j = n-1, j=n-i-1
            //note for overlaping element in odd matrix
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }

    public static boolean stairChaseSearch(int matrix[][], int key){
        int n = 0;
        int m = matrix[0].length-1;
        while(n<matrix.length && m>=0){
            if(key == matrix[n][m]){
                System.out.print("key found at index "+n + ", "+ m);
                return true;
            }else if(key < matrix[n][m]){
                m--;
            }else if(key > matrix[n][m]){
                n++;
            }
        }
        System.out.print("key not found !");
        return false;
    }
}