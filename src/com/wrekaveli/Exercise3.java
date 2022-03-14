package com.wrekaveli;

public class Exercise3 {
    public static void execute() {
        int x = 10;
        System.out.println("Unary operators ++ and --");
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int a = 10;
        int b = 5;
        System.out.println("Arithmetic operators +, -, *, / and %");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("Expressions");
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

        int c = 20;
        System.out.println("Logical operators && and ||");
        System.out.println(a < b && a < c); //false && true = false
        System.out.println(a > b || a < c); //true || true = true

        int min = a < b ? a : b;
        System.out.println("Ternary operator if then (?) else (:)");
        System.out.println(min);

        System.out.println("Assignment operators =, +=, -=, *= and /=");
        a += 3; //10+3
        System.out.println(a);
        a -= 4; //13-4
        System.out.println(a);
        a *= 2; //9*2
        System.out.println(a);
        a /= 2; //18/2
        System.out.println(a);
    }
}
