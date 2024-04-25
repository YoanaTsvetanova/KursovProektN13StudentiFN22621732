package bg.tu_varna.sit.b1.f22621732;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static Map<String, Student> students = new HashMap<>();
    private static String currentFileName = null;
    private static boolean fileOpened = false;
    private static Scanner scanner = new Scanner(System.in);

    private static void displayHelp() {
        System.out.println("The following commands are supported:");
        System.out.println("Open - Open a file");
        System.out.println("Save - Save the current file");
        System.out.println("SaveAs - Save the current file as a new file");
        System.out.println("Close - Close the current file");
        System.out.println("Help - Display available commands");
        System.out.println("Exit - Exit the program");
        System.out.println("Enroll <fn><program><group><name> - Enroll a student)");
        System.out.println("Advance <fn> - Enroll a student in an upper course");
        System.out.println("Graduate <fn> - Mark a student as a graduate");
        System.out.println("Interrupt <fn> - Mark a students course as interrupted");
        System.out.println("Resume <fn> - Mark a students course as resumed");
        System.out.println("Print <fn> - Print all for this student");
        System.out.println("PrintAll <program><year>- Print all students in this program and year");
        System.out.println("EnrollIn <fn><course> - Enroll student in this course");
        System.out.println("AddGrade <fn><course><grade> - Add a grade");
        System.out.println("Protocol <course> - Print protocols for students in this course");
        System.out.println("Report <fn> - Print a report for this student");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System!");
        System.out.println("Type 'Help' to see available commands.");

        boolean running = true;

        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");

            String command = parts[0];
            String[] arguments = Arrays.copyOfRange(parts, 1, parts.length);

            switch (command) {
                case "Open":
                        System.out.println("open");
                    break;
                case "Save":
                    System.out.println("save");
                    break;
                case "SaveAs":
                        System.out.println("saveas");
                    break;
                case "Close":
                    System.out.println("close");
                    break;
                case "Help":
                    displayHelp();
                    break;
                case "Exit":
                    running = false;
                    break;
                case "Enroll":
                    if (arguments.length == 4) {
                        enrollStudent(arguments[0], arguments[1], arguments[2], arguments[3]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Advance":
                    if (arguments.length == 1) {
                        advanceStudent(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Graduate":
                    if (arguments.length == 1) {
                        graduateStudent(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Interrupt":
                    if (arguments.length == 1) {
                        interruptStudent(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Resume":
                    if (arguments.length == 1) {
                        resumeStudent(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Print":
                    if (arguments.length == 1) {
                        printStudent(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "PrintAll":
                    if (arguments.length == 2) {
                        printAllStudents(arguments[0], Integer.parseInt(arguments[1]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "EnrollIn":
                    if (arguments.length == 2) {
                        enrollInCourse(arguments[0], arguments[1]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "AddGrade":
                    if (arguments.length == 3) {
                        addGrade(arguments[0], arguments[1], Integer.parseInt(arguments[2]));
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Protocol":
                    if (arguments.length == 1) {
                        printProtocol(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Report":
                    if (arguments.length == 1) {
                        printReport(arguments[0]);
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    if (!fileOpened) {
                        System.out.println("error");
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
    private static void openFile(String filename) {
    }

    private static void saveFile() {
    }

    private static void saveAsFile(String filename) {
    }

    private static void closeFile() {
   }

    private static void enrollStudent(String facultyNumber, String program, String group, String name) {
        Student student = new Student(name, facultyNumber, program, group, "записан");
        students.put(facultyNumber, student);
    }

    private static void advanceStudent(String facultyNumber) {
    }

    private static void graduateStudent(String facultyNumber) {
    }

    private static void interruptStudent(String facultyNumber) {
    }

    private static void resumeStudent(String facultyNumber) {
    }

    private static void printStudent(String facultyNumber) {
    }

    private static void printAllStudents(String program, int year) {
    }

    private static void enrollInCourse(String facultyNumber, String course) {
    }

    private static void addGrade(String facultyNumber, String course, int grade) {
    }

    private static void printProtocol(String course) {
    }

    private static void printReport(String facultyNumber) {
    }

}



