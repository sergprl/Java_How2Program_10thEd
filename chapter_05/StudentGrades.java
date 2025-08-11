import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrades {
    static int aCount = 0;
    static int bCount = 0;
    static int cCount = 0;
    static int dCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter letter grade: ");
            char grade = input.next().toUpperCase().charAt(0);

            map.put(name, grade);

            switch (grade) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
            }
        }

        for (String name : map.keySet()) {
            System.out.printf("%10s: %c%n", name, map.get(name));
        }

        System.out.printf("Summary:%n" +
                "%c: %d%n" +
                "%c: %d%n" +
                "%c: %d%n" +
                "%c: %d",
                'A', aCount,
                'B', bCount,
                'C', cCount,
                'D', dCount);
    }
}
