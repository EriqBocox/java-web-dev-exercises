package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            System.out.println(evenNum(numbers));


        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "Goodbye", "Seeya"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int length = input.nextInt();
        input.close();
            printFive(words, length);
    }


    public static int evenNum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    public static void printFive(ArrayList<String> words, int length){
        for(String i : words) {
            if(i.length() == length){
                System.out.println(i);
            }
        }
    }
}
