import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double item1 = InputHelper.getRangedDouble(scan, "Enter the item price: $", 0.50, 9.99);
        boolean confirm = InputHelper.getYNConfirm(scan,"Do you want to add another item? [Y/N]");
        do {
            double nextItems = InputHelper.getRangedDouble(scan, "Enter the item price: $", 0.50, 9.99);
            double totalCost = item1 + nextItems;
        } while (confirm);
    }
}
