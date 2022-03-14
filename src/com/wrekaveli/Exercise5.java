package com.wrekaveli;

public class Exercise5 {
    public static void execute() {

        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is iteration: " + i);
        }

        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("This is iteration: " + i);
            i++;
        }

        System.out.println("Do-While loop:");
        int j = 1;
        do {
            System.out.println("This is iteration: " + j);
            j++;
        } while(j <= 5);
    }
}
