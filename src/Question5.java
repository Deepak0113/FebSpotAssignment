import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    private int findCount(char[] subStrChars){
        int[] map = new int[26];
        int count = 0;
        boolean flag = true;

        for(char ch: subStrChars){
            map[ch-'a']++;
        }

        for(int i=0; i<26; i++){
            if(map[i]!=0){
                if(map[i]%2 == 0){
                    count++;
                } else if(flag){
                    count++;
                    flag = false;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mainString = sc.nextLine();
        int n = sc.nextInt();
        Question5 q5 = new Question5();

        while(n-- > 0){
            int start = sc.nextInt();
            int end = sc.nextInt();

            char[] subStrChars = mainString.substring(start-1, end).toCharArray();
            System.out.println(q5.findCount(subStrChars));
        }
    }
}
