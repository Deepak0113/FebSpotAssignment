import java.util.*;

public class Question3 {
    private int getNotificationCount(int days, int[] arr, int arrSize){
        // notification count
        int notificationCount = 0;

        int[] tempArr = copyAndSortRange(arr, 0, days);
        int currentMedian = getMedian(tempArr, days);

        int i=1, j=days-1;
        while(j<arrSize){
            tempArr = copyAndSortRange(arr, i, j+1);
            if(arr[j] >= currentMedian*2){
                notificationCount++;
            }
            currentMedian = getMedian(tempArr, days);
            j++;
            i++;
        }

        return notificationCount;
    }

    private int getMedian(int[] list, int size){
        if(size%2!=0){
            return list[size/2];
        }

        return (list[size/2] + list[(size+1)/2])/2;
    }

    private int[] copyAndSortRange(int[] arr, int start, int end){
        int[] tempArray = Arrays.copyOfRange(arr, start, end);
        Arrays.sort(tempArray);
        return tempArray;
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

        Question3 q3 = new Question3();
        int res = q3.getNotificationCount(days, arr, arrSize);

        System.out.println(res);
    }
}
