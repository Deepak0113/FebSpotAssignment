import java.util.*;

public class Question1 {
    private List<List<Integer>> getCost(int arrLen, int[] arr, int target){
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

        for(int i=0; i<arrLen; i++){
            int diff = target - arr[i];
            if(diff<0 || diff == arr[i]) continue;
            if(hashMap.containsKey(arr[i])){
                ArrayList<Integer> arrayList = hashMap.get(arr[i]);
                for(int position1: arrayList){
                    result.add(new ArrayList<>(Arrays.asList(position1+1, i+1)));
                }
            }
            ArrayList<Integer> arrayList = hashMap.containsKey(diff) ? hashMap.get(diff) : new ArrayList<>();
            arrayList.add(i);
            hashMap.put(diff, arrayList);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get number of prices n
        System.out.println("How many number of prices: ");
        int arrLen = sc.nextInt();

        // creating int array of size n
        int[] arr = new int[arrLen];

        // get n prices
        System.out.println("Enter prices: ");
        for(int i=0; i<arrLen; i++){
            arr[i] = sc.nextInt();
        }

        // get total cost
        System.out.println("What is the total cost: ");
        int target = sc.nextInt();

        Question1 q1 = new Question1();

        // calls the getCost methods
        List<List<Integer>> res = q1.getCost(arrLen, arr, target);

        // prints the result array
        System.out.println(res);
    }
}
