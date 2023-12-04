import java.util.Scanner;
public class FavNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userFavInt = InputHelper.getInt(scan, "What is your favorite whole number?");
        double userFavDouble = InputHelper.getDouble(scan, "What is your favorite number?");

        System.out.println("Your favorite whole number is: " + userFavInt + " and your favorite number is: " + userFavDouble);
    }
}
