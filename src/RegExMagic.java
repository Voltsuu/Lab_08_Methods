import java.util.Scanner;

public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String SSN;
        String StudentMNum;
        String menuOption;

        SSN = InputHelper.getRegExString(scan, "Enter your SSN","\\d{3}-\\d{2}-\\d{4}");

        System.out.println("Your SSN is: " + SSN);
        System.out.println(" ");

        StudentMNum = InputHelper.getRegExString(scan, "Enter your Student M number:", "(M|m)\\d{5}");

        System.out.println("Your Student M Number is: " + StudentMNum);
        System.out.println(" ");

        menuOption = InputHelper.getRegExString(scan, "Menu:  O - Open  S - Save  V - View  Q - Quit", "[OoSsVvQq]");

        System.out.println("You chose: " + menuOption);
    }
}