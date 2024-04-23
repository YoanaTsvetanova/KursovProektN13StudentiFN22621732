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
                default:
                    if (!fileOpened) {
                        System.out.println("No file is currently open. Please open a file first.");
                    } else {
                        System.out.println("Unknown command. Type 'Help' for available commands.");
                    }
                    break;
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}


