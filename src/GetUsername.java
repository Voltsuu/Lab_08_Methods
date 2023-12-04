import java.util.Scanner;
public class GetUsername {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = InputHelper.getNonZeroLengthString(scan, "What is your username?");
    }
}