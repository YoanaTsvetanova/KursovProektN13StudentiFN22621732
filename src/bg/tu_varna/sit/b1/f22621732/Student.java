package bg.tu_varna.sit.b1.f22621732;

public class Student {
    private String name;
    private String facultyNumber;
    private String specialty;
    private int currentCourse;
    private String group;
    private String status;
    private double averageGrade;

    public Student(String name, String facultyNumber, String specialty, String group, String status) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.specialty = specialty;
        this.group = group;
        this.status = status;
        this.averageGrade = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public int getCurrentCourse() {
        return currentCourse;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
