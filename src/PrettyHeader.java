import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String msg = scan.nextLine();
        InputHelper.prettyHeader(msg);
    }
}