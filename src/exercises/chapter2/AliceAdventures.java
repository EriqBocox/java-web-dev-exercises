package exercises.chapter2;

import java.util.Scanner;

public class AliceAdventures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentance =
                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to" +
                        " do: once or twice she had peeped into the book her sister was reading, but it had no " +
                        "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                        "pictures or conversation?'";
        String lowerCaseSentance = sentance.toLowerCase();

        System.out.println("Search for word: ");
        String word = input.nextLine().toLowerCase();

        boolean result = lowerCaseSentance.contains(word);
        System.out.println(result);

        //part 5
        int index = lowerCaseSentance.indexOf(word);
        int length = word.length();
        System.out.println("The index of " + word + " is " + index);
        System.out.println("The length of " + word + " is " + length);
        String wordSpaced = " " + word;
        String modifiedSentance = lowerCaseSentance.replace(wordSpaced,"Eriq");
        System.out.println(modifiedSentance);



        input.close();
    }
}
