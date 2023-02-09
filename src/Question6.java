import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    private void rotateMatrix(int[][] matrix, int size){
        int temp;

        for(int i=0; i<size/2; i++){
            for(int j=i; j<size-i-1; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[size-j-1][i];
                matrix[size-j-1][i] = temp;

                temp = matrix[i][j];
                matrix[i][j] = matrix[size-i-1][size-j-1];
                matrix[size-i-1][size-j-1] = temp;

                temp = matrix[i][j];
                matrix[i][j] = matrix[j][size-i-1];
                matrix[j][size-i-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: ");
        int size = sc.nextInt();
        int[][] martix = new int[size][size];

        int val = 1;

        System.out.println("Enter matrix: ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
//                martix[i][j] = sc.nextInt();
                martix[i][j] = val++;
            }
        }

        Question6 q6 = new Question6();

        System.out.println("Before rotate: ");
        for(int[] arr : martix){
            System.out.println(Arrays.toString(arr));
        }

        q6.rotateMatrix(martix, size);

        System.out.println("After rotate: ");
        for(int[] arr : martix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
