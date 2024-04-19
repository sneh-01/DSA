package TwoDArray;

public class DiagnolSum {
    public static int diagnols(int matrix[][]){

        int sum =0 ;
        // for (int i = 0 ; i < matrix.length ; i++){
        //     for (int j = 0 ; j < matrix.length ; j++){
        //         // primary diagonal
        //         if (i == j){
        //             sum += matrix[i][j];
        //         }
        //         // secondary diagonal
        //         else if(i + j == matrix.length-1){
        //              sum += matrix[i][j];
        //         }
        //     }
        //     System.out.println(sum);
        //     sum = 0;
        // }

        for (int i = 0 ; i < matrix.length ; i++){
            sum += matrix[i][i];
            if (i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
           

        }
        return sum;

    }
    public static void main(String[] args) {

        int matrix [][] = {{1 , 2, 3, 4},
                            {5 , 6, 7, 8},
                            {9 , 10, 11, 12},
                            // {13, 14, 15, 16},
                            };
        // sspiral(matrix);
        System.out.print(diagnols(matrix) + " ");
        System.out.println();
        
    }
}
