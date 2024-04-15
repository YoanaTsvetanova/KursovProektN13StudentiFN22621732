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
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System!");
        System.out.println("Type 'Help' to see available commands.");
    }
}