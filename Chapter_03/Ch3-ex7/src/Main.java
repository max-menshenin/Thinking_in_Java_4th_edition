/* Exercise 8: (2) Show that hex and octal notations work with long values. 
Use Long.toBinaryString( ) to display the results. */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random flip = new Random();
        flip.nextBoolean();
        System.out.println(flip.nextBoolean() == true?"Head":"Tail");
    }
}