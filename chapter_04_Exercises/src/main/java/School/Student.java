package School;

public class Student
{
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;

        // verify
        if (average >= 0)
            if (average <= 100)
                this.average = average;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        if (average >= 0)
            if (average <= 100)
                this.average = average;
    }

    // getters
    public double getAverage() {
        return average;
    }

    public String getName() {
        return name;
    }

    public String getLetterGrade() {
        String letterGrade = "";

        if (this.average >= 90) {
            return "A";
        } else if (this.average >= 80){
            return "B";
        } else if (this.average >= 70){
            return "C";
        } else if (this.average >= 65){
            return "D";
        } else {
            return "F";
        }
    }
}
