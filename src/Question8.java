import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    private void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int insertValue = arr[i];
            for(int j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]){
                    arr[j+1] = arr[j];
                    arr[j] = insertValue;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get array size
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // array creation
        int[] arr = new int[size];

        // get array input
        System.out.println("Enter the array: ");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();

        // call insertionSort()
        Question8 q8 = new Question8();
        q8.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
