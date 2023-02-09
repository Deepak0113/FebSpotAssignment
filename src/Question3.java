import java.util.*;

public class Question6 {
    int rotateMatrix(int days, int[] arr, int arrSize){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<days; i++)
            list.add(arr[i]);

        List<Integer> listSort = new ArrayList<>(list);
        Collections.sort(listSort);

        int currentMedian = getMedian(listSort, days);
        int notifyCount = 0;

        System.out.println(list + " " + listSort + " " + currentMedian);


        for(int i=days; i<arrSize; i++){
            list.remove(0);
            list.add(arr[i]);

            listSort = new ArrayList<>(list);
            Collections.sort(listSort);

            int median = getMedian(listSort, days);

            System.out.println(list + " " + listSort + " " + currentMedian + " " + median);

            if(median*2 >= currentMedian)
                notifyCount++;

            currentMedian = median;
        }

        return notifyCount;
    }

    private int getMedian(List<Integer> list, int size){
        if(size%2!=0){
            return list.get(size/2);
        }

        return (list.get(size/2) + list.get((size+1)/2))/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get how many number we want as n
        System.out.println("How many numbers: ");
        int arrSize = sc.nextInt();

        System.out.println("How many days: ");
        int days = sc.nextInt();

        // creating int array of size n
        int[] arr = new int[arrSize];

        // get n numbers
        System.out.println("Enter numbers: ");
        for(int i=0; i<arrSize; i++){
            arr[i] = sc.nextInt();
        }

        Question6 q6 = new Question6();
        int res = q6.rotateMatrix(days, arr, arrSize);

        System.out.println(res);
    }
}
