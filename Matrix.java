public class Matrix {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int k = 3;
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[m][k];
        int[][] matrixC = new int[n][k];
        System.out.println("Matrix A: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrixA[i][j] = (int) (Math.random()*100);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix B: ");
        for (int i = 0 ;i < m; i++){
            for (int j = 0; j < k; j++){
                matrixB[i][j] = (int) (Math.random() * 100);
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MatrixC:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < k; j++){
                for (int l = 0 ;l < m; l++){
                    matrixC[i][j] += matrixA[i][l] * matrixB[l][j];
                }
                System.out.print(matrixC[i][j] + "\t");
            }
            System.out.println();
        }
    }


}