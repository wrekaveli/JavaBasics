package com.wrekaveli;

public class Exercise4 {
    public static void execute() {
        int sum = 10 + 5;
        if (sum > 20) {
            System.out.println("Sum is greater than 20.");
        } else if (sum > 10) {
            System.out.println("Sum is less than 20 but greater than 10.");
        } else {
            System.out.println("Sum is NOT greater than 20 and NOT greater than 10.");
        }

        switch (sum) {
            case 20:
                System.out.println("Sum is 20.");
                break;
            case 15:
                System.out.println("Sum is 15.");
                break;
            default:
                System.out.println("Sum is something else.");
                break;
        }
    }
}
