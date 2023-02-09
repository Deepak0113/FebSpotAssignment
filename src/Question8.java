import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    private void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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
