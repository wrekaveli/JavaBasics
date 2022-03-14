package com.wrekaveli;

public class Exercise2 {
    public static void execute() {
        boolean b = true; // default: false, default size: 1 bit, range: true/false
        System.out.println(b);

        char c = 'A'; // default: /u0000, default size: 2 byte, range: /u0000 to /uffff
        System.out.println(c);

        byte by = 127; // default: 0, default size: 1 byte, range: -128 to 127
        System.out.println(by);

        short s = 10000; // default: 0, default site: 2 byte, range: -32,768 to 32,767
        System.out.println(s);

        int i = 100000; // default: 0, default size: 4 byte, range: - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
        System.out.println(i);

        long l = 1000000L; // default: 0, default size: 8 byte, range: -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
        System.out.println(l);

        float f = 12.345F; // default: 0.0F, default size: 4 byte, range: single-precision 32-bit IEEE 754 floating point
        System.out.println(f);

        double d = 1.99D; // default: 0, default size: 8 byte, range: double-precision 64-bit IEEE 754 floating point
        System.out.println(d);
    }
}
