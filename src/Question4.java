import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question4 {
    private String recursion(String[] words, String mainString, int index, String resStr){
        if(mainString.isEmpty()) return "null";
        if(mainString.length() == index) return resStr;


        for(int i=0; i<words.length; i++){
            String word = words[index];

            if(index+word.length() > mainString.length()) continue;

            String mainStringPart = mainString.substring(index, index+word.length());
            if(word.equals(mainStringPart)){
                String result = recursion(words, mainString, index+word.length(), resStr+mainStringPart+" ");
                if(!result.equals("null")){
                    return result;
                }
            }
        }

        return "null";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get number of test cases
        System.out.println("number of testcases: ");
        int testcases = sc.nextInt();

        Question4 q4 = new Question4();

        while(testcases-- > 0){
            // number of words
            System.out.println("number of words: ");
            int noOfWords = Integer.parseInt(sc.nextLine());

            // get words
            System.out.println("words: ");
            String[] words = new String[noOfWords];
            for(int i=0; i<noOfWords; i++)
                words[i] = sc.nextLine();

            // get main string
            System.out.println("main string: ");
            String mainString = sc.nextLine();

            System.out.println(q4.recursion(words, mainString, 0, ""));
        }
    }
}
