import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question4 {
    private String replace(String string1, String string2){
        int ind = string1.indexOf(string2);
        if(ind == -1)
            return string1;
        string1 = string1.substring(0, ind-1) + " " + string2 + " " + string1.substring(ind+string2.length());
        return replace(string1 , string2);
    }

    private String rec(String[] words, String mainString){
        HashSet<String> hashSet = new HashSet<>();

        for(String word: words){
            if(hashSet.contains(word)) continue;
            if(word.equals(mainString)) continue;
            hashSet.add(word);
            mainString = replace(word, mainString);
        }

        return mainString;
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
            int noOfWords = sc.nextInt();

            // get words
            System.out.println("words: ");
            String[] words = new String[noOfWords];
            for(int i=0; i<noOfWords; i++)
                words[i] = sc.nextLine();

            // get main string
            System.out.println("main string: ");
            String mainString = sc.nextLine();

            System.out.println(q4.rec(words, mainString));
        }
    }
}
