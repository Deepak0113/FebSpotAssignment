import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    void pattern(int n, int[][] matrix){
        for(int k=0; k<=n/2; k+=2){
            for(int i=k; i<n-k; i++){
                if(i==k || i==n-k-1){
                    // only for the entire row
                    for(int j=k; j<n-k; j++){
                        matrix[i][j] = 1;
                    }
                } else{
                    // only for the ends
                    matrix[i][k] = 1;
                    matrix[i][n-k-1] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input n
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        Question9 q9 = new Question9();

        // matrix of size nxn
        int[][] matrix = new int[n][n];

        // pattern method call
        q9.pattern(n, matrix);

        // display the matrix
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
