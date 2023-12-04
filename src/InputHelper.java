import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
    // Gets a > 0 length string
    public static String getNonZeroLengthString(Scanner scan, String prompt) {
        String input;

        do {
            System.out.println(prompt);
            input = scan.nextLine();

            if (input.length() > 0) {
                break;
            } else {
                System.out.println("Invalid prompt. Please try again");
            }

        } while (true);

        System.out.println(input);
        return input;
    }
    // Gets ints only
    public static int getInt(Scanner scan, String prompt) {
        int value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while (true);

        return value;
    }

    // Gets doubles only
    public static double getDouble(Scanner scan, String prompt) {
        double value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please try again");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Gets int > 0
    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int value = 0;
        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();

                if (value > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }

            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while (true);

        return value;
    }


    // Checks if an int is within a range
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int value = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                if (value <= max && value >= min) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Checks if a double is within a range
    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double value = 0.00;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                if (value <= max && value >= min) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
            scan.nextLine();
        } while(true);

        return value;
    }

    // Yes/No prompt
    public static boolean getYNConfirm(Scanner scan, String prompt) {
        boolean YN;
        String confirmation;

        System.out.println(prompt);

        do {
            confirmation = scan.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                YN = true;
                break;
            } else if (confirmation.equalsIgnoreCase("n")) {
                YN = false;
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);

        return YN;
    }

    // Finds specific number of lines
    public static String getRegExString(Scanner scan, String prompt, String regEx) {
        String input;

        do {
            System.out.println(prompt);
            input = scan.nextLine();
            if (input.matches(regEx)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while (true);

        return input;
    }
}
