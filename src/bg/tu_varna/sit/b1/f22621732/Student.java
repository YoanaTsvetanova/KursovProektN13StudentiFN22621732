package bg.tu_varna.sit.b1.f22621732;

public class Student {
    private String name;
    private String facultyNumber;
    private String program;
    private String group;
    private String status;
    private double averageGrade;

    public Student(String name, String facultyNumber, String program, String group, String status) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.program = program;
        this.group = group;
        this.status = status;
        this.averageGrade = 0.0;
    }
}