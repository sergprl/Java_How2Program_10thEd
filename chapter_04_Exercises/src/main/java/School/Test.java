package School;

public class Test {
    public static void main(String[] args) {
        Student pedrito = new Student("Pedrin", 75);
        System.out.println(pedrito.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", pedrito.getName(), pedrito.getLetterGrade());
    }
}
