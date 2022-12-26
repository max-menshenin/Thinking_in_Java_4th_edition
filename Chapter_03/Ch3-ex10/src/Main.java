/*
Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes,
 with a zero in the least-significant digit, and the second, also alternating, with a one in the least-significant
 digit (hint: It’s easiest to use hexadecimal constants for this). Take these two values and
combine them in all possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ). */

public class Main {
    public static void main(String[] args) {
        int i1 = 0Xa3355fcd;
        int i2 = 0Xec355edd;
        System.out.println("i1 = "+Integer.toBinaryString(i1));
        System.out.println("i2 = "+Integer.toBinaryString(i2));
        System.out.println("~i1 =  "+Long.toBinaryString(~i1));
        System.out.println("~i2 = "+Long.toBinaryString(~i2));
        System.out.println("i1&i1 =  "+Long.toBinaryString(i1&i1));
        System.out.println("i1|i1 =  "+Long.toBinaryString(i1|i1));
        System.out.println("i1^i1 =  "+Long.toBinaryString(i1^i1));
        System.out.println("i1&i2 =  "+Long.toBinaryString(i1&i2));
        System.out.println("i1|i2 =  "+Long.toBinaryString(i1|i2));
        System.out.println("i1^i2 =  "+Long.toBinaryString(i1^i2));
    }
}

// Out:
//  i1 = 10100011001101010101111111001101
//  i2 = 11101100001101010101111011011101
//  ~i1 =  1011100110010101010000000110010
//  ~i2 = 10011110010101010000100100010
//  i1&i1 =  1111111111111111111111111111111110100011001101010101111111001101
//  i1|i1 =  1111111111111111111111111111111110100011001101010101111111001101
//  i1^i1 =  0
//  i1&i2 =  1111111111111111111111111111111110100000001101010101111011001101
//  i1|i2 =  1111111111111111111111111111111111101111001101010101111111011101
//  i1^i2 =  1001111000000000000000100010000

