import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {


    public static void order(String[] words) {
        Scanner entry = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter a word");
            words[i] = entry.nextLine();
        }

        Arrays.sort(words);

        System.out.println("");
        System.out.println("Words after array.sort:");
        for (String i: words){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        String[] words = new String[4];

        order(words);
    }
}
