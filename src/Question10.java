import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question10 {
    private List<List<Integer>> getPairs(int[] array, int checkDiv){
        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if((array[i]+array[j])%checkDiv == 0){
                    resultList.add(Arrays.asList(array[i], array[j]));
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get array size
        System.out.println("array size: ");
        int size = sc.nextInt();

        // creating int array
        int[] array = new int[size];

        // get array
        System.out.println("Enter array items: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        // get divisibility checking number k
        System.out.println("Enter k value: ");
        int checkDiv = sc.nextInt();

        Question10 q10 = new Question10();

        List<List<Integer>> result = q10.getPairs(array, checkDiv);

        for(List<Integer> pair: result){
            System.out.println(pair);
        }
    }
}
