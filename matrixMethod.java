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

        diagnalSum(matrix_even);
        diagnalSum(matrix_odd);
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
}