package org.example;


public class HelloAppUC6 {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = "Hello ";

            // Enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // Remove last ", "
            result = result.substring(0, result.length() - 2);

            System.out.println(result);
        } else {
            System.out.println("Hello, World!");
        }
    }
}
