import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    private void sort(int[] indPos, String[] strPos, int[] originalPos){
        for(int i=0;i<indPos.length;i++){
            int j=i-1;
            int insertValue = indPos[i];
            String string = strPos[i];
            int oPos = originalPos[i];

            while(j>=0 && indPos[j]>insertValue){
                indPos[j+1]=indPos[j];
                strPos[j+1]=strPos[j];
                originalPos[j+1]=originalPos[j];
                j--;
            }

            indPos[j+1]=insertValue;
            strPos[j+1]=string;
            originalPos[j+1]=oPos;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] indPos = new int[n];
        String[] strPos = new String[n];
        int[] originalPos = new int[n];

        String[] inputString;
        String result = "";

        for(int i=0; i<n; i++){
            inputString = sc.nextLine().split(" ");
            indPos[i] = Integer.parseInt(inputString[0]);
            strPos[i] = inputString[1];
            originalPos[i] = i;
        }

        Question2 q2 = new Question2();
        q2.sort(indPos, strPos, originalPos);

        for(int i=0; i<n; i++){
            if(originalPos[i] < n/2){
                result += "- ";
            } else{
                result += strPos[i] + " ";
            }
        }

        System.out.println(result);
    }
}