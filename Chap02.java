public class Chap02 {
    public static void main(String[] args) {
        System.out.print("There is no newline after this");
        System.out.println("There is a newline after this");

        // primitive data types
        int pi = 3;

        double e = 2.71828;

        boolean isThisJava = true;

        char a = 'a';

        // arithmetic operators
        int x = 5;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // integer division
        System.out.println(x % y);

        // Strings
        String name = "Andy";
        // Strings are reference data types

        // comparison operators
        boolean cierto = true;
        boolean falso = false;

        System.out.println(cierto && falso);
        System.out.println(cierto || falso);
        System.out.println(!cierto);

        // conditional statements
        if (x == y) {
            System.out.println("x is equal to y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than y");
        }

        // loops
        int num = 0;
        while (num < 3) {
            System.out.println(num);
            num++;
        }

        num = 100;
        do { // executes at least once
            System.out.println(num);
            num++;
        } while (num < 3);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        char[] hello = { 'h', 'e', 'l', 'l', 'o' };
        for (char s : hello) {
            System.out.println(s);
        }

        // break & continue work the same as in most other languages

        // user-made methods
        System.out.println(greet("Andy"));

        // String methods
        String greeting = "Hello World!";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.indexOf("World"));
        System.out.println(greeting.substring(6, 11));
        System.out.println("Hello World!".equals(greeting)); // use this when checking for equality
    }

    // methods
    public static String greet(String name) {
        return "Hello " + name + "!";
    }
}

// this is a one-line comment
/*
 * This is a
 * multiline comment
 */