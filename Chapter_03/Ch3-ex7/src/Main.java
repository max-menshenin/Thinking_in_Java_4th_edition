/* Exercise 7: (3) Write a program that simulates coin-flipping. */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random flip = new Random();
        flip.nextBoolean();
        System.out.println(flip.nextBoolean() == true?"Head":"Tail");    }
}