package bg.tu_varna.sit.b1.f22621732;
import java.util.*;

public class Student {

    private String name;
    private String facultyNumber;
    private String specialty;
    private int currentCourse;
    private String group;
    private String status;
    private double averageGrade;
    private Map<String, String> enrolledCourses;
    private Map<String, Integer> grades;

    public Student(String name, String facultyNumber, String specialty, String group, String status) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.specialty = specialty;
        this.group = group;
        this.status = status;
        this.averageGrade = 0.0;
        this.grades = new HashMap<>();
        this.enrolledCourses = new HashMap<>();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyNumber() {

        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public int getCurrentCourse() {

        return currentCourse;
    }

    public void setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
    }

    public String getSpecialty() {

        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAverageGrade() {

        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    /*public void ToString(){
        System.out.println("name:"+this.name);
        System.out.println("group:"+this.group);
        System.out.println("status:"+this.status);


    }*/
}
