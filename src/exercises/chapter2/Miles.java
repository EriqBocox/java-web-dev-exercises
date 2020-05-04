package exercises.chapter2;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have been driven? ");
        double miles = input.nextDouble();

        System.out.println("How many gallons have been consumed? ");
        double gallons = input.nextDouble();

        System.out.println("Your MPG is " + (miles/gallons) + ".");

        input.close();
    }
}
