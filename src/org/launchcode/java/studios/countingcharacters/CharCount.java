package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentance = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String lowerCaseSentance = sentance.toLowerCase();

        HashMap<Character, Integer> count = new HashMap<>();
        for(char i : lowerCaseSentance.toCharArray())
            count.put(i, count.getOrDefault(i, 0) + 1);

//        char[] charactersInString = sentance.toCharArray();
//        HashMap<Character, Integer> letters = new HashMap<>();
//
//        int count = 1;
//        for (char letter : charactersInString) {
//            if (letters.containsKey(letter)) {
//                count = letters.get(letter);
//                count++;
//                letters.replace(letter, count);
//            } else if (!letters.containsKey(letter)) {
//                letters.put(letter, 1);
//            }
//        }

       for( Map.Entry<Character, Integer> c : count.entrySet()){
            System.out.println(c.getKey() + " : " + c.getValue());
        }
    }
}


