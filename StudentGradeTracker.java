import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        ArrayList<Integer> grades = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            scanner.close();
            return;
        }

        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int g : grades) {
            sum += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }

        double average = (double) sum / grades.size();

        System.out.println("\n===== Grade Summary =====");
        System.out.println("Total students : " + grades.size());
        System.out.println("Average grade  : " + average);
        System.out.println("Highest grade  : " + highest);
        System.out.println("Lowest grade   : " + lowest);

        System.out.println("\nAll grades: " + grades);

        scanner.close();
    }
}
