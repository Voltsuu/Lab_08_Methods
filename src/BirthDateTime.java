import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int birthYear = InputHelper.getRangedInt(scan, "What year were you born in [1950-2010]?", 1950, 2010);
        int birthMonth = InputHelper.getRangedInt(scan, "What month were you born in [1-12]?", 1, 12);
        int birthDay = InputHelper.getRangedInt(scan, "What day were you born [1-31]?", 1, 31);
        int birthHour = InputHelper.getRangedInt(scan, "What hour were you born [1-24]?", 1, 24);
        int birthMinute = InputHelper.getRangedInt(scan, "What minute were you born [1-60]?", 1, 60);

        System.out.printf("%-4s %4d", "Year:", birthYear);
        System.out.printf("\n%-5s %2d", "Month:", birthMonth);
        System.out.printf("\n%-3s %2d", "Day:", birthDay);
        System.out.printf("\n%-4s %2d", "Hour:", birthHour);
        System.out.printf("\n%-6s %2d", "Minute:", birthMinute);
    }
}
