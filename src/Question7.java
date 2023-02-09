import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question7 {
    private void getSubsets(int[] arr, int start, int end, List<Integer> ds, List<List<Integer>> res){
        // adds ds (data structure that has subsets) in the res (result) list
        res.add(new ArrayList<>(ds));

        for(int i=start; i<end; i++){
            // passes only if the previous visited element is equal as it will generate duplicates
            if(i!=start && arr[i-1]==arr[i]) continue;

            // add to the subset data structure
            ds.add(arr[i]);
            getSubsets(arr, i+1, end, ds, res);

            // remove the recently added element from ds as it should check subsets without the recently added element
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get how many number we want as n
        System.out.println("How many numbers: ");
        int n = sc.nextInt();

        // creating int array of size n
        int[] arr = new int[n];

        // get n numbers
        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Question7 q7 = new Question7();

        // res is result that stores all the subsets
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        // starting of recursive call
        q7.getSubsets(arr, 0, n, new ArrayList<>(), res);

        System.out.println(res);
        for(int i=0; i<=n; i++){
            for(List<Integer> subsets: res){
                if(subsets.size() == i){
                    System.out.print(subsets+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Total number of subsets: " + res.size());
    }
}

/*
SAMPLE OUTPUTS

TEST CASE 1:
How many numbers:
3
Enter numbers:
1 2 3
[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]

TEST CASE 2:
How many numbers:
3
Enter numbers:
1 2 2
[[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]
 */