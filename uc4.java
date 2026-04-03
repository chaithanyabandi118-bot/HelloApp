public class uc4 {
    
    public static void main(String[] args) {

        // If no names are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello, ");

            // Loop through all names
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add comma if not last name
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("!");
        }
    }

}
