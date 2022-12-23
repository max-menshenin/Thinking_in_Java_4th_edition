/* Exercise 4: Write a program that calculates velocity using a
constant distance and a constant time. */

package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter distance");
        float distance = Float.parseFloat(br.readLine());
        System.out.println("Enter time");
        float time = Float.parseFloat(br.readLine());
        if (time== 0 && distance == 0){
            System.out.println("velocity = 0m/s");
        } else {
            float velocity = distance / time;
            System.out.println(velocity + "m/s");}
    }
}

