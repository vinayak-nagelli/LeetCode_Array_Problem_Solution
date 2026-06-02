// i solved using multiple for loop , that is not efficient , but i tried own .


public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        

    }

    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int [] [] arr=new int[rows] [columns];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(matrix[i][j]==0){
                    for(int k=0;k<columns;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<rows;k++){
                        arr[k][j]=0;
                    }
                }
                
            }
        }

            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    matrix[i][j]=arr[i][j];
                }
            }



    }
}
