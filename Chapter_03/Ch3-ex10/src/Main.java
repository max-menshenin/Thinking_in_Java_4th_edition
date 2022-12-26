/*
Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes,
 with a zero in the least-significant digit, and the second, also alternating, with a one in the least-significant
 digit (hint: It’s easiest to use hexadecimal constants for this). Take these two values and
combine them in all possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ). */

public class Main {
    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;

        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 =  " + Long.toBinaryString(~i1));
        System.out.println("~i2 = " + Long.toBinaryString(~i2));
        System.out.println("i1&i1 =  " + Long.toBinaryString(i1 & i1));
        System.out.println("i1|i1 =  " + Long.toBinaryString(i1 | i1));
        System.out.println("i1^i1 =  " + Long.toBinaryString(i1 ^ i1));
        System.out.println("i1&i2 =  " + Long.toBinaryString(i1 & i2));
        System.out.println("i1|i2 =  " + Long.toBinaryString(i1 | i2));
        System.out.println("i1^i2 =  " + Long.toBinaryString(i1 ^ i2));
    }
}

// Out:
// i1 = 10111011101110111011101110111011
// i2 = 1010101010101010101010101010101
// ~i1 =  1000100010001000100010001000100
// ~i2 = 1111111111111111111111111111111110101010101010101010101010101010
// i1&i1 =  1111111111111111111111111111111110111011101110111011101110111011
// i1|i1 =  1111111111111111111111111111111110111011101110111011101110111011
// i1^i1 =  0
// i1&i2 =  10001000100010001000100010001
// i1|i2 =  1111111111111111111111111111111111111111111111111111111111111111
// i1^i2 =  1111111111111111111111111111111111101110111011101110111011101110