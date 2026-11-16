public class Student {

    private String name;
    private String studentId;
    private double grade;

    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + studentId + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Clyde Uriel Wystan Dizon", "251-0652-1", 90.0);
        Student student2 = new Student("Mary Joy Culos", "251-0543-1", 88.5);

        student1.setGrade(92.0);

        student1.displayInfo();
        student2.displayInfo();
    }
}