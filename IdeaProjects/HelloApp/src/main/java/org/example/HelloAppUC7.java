package org.example;

public class HelloAppUC7 {
    public static void main(String[] args) {

        if (args.length > 0) {
            // Join all names with comma
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        } else {
            System.out.println("Hello, World!");
        }
    }
}