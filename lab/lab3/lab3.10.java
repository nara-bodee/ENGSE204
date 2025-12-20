package lab3_10;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class lab3_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command (SET/LOG): ");
            String command = input.next();

            if (command.equals("SET")) {
            	System.out.println("Enter new log level: ");
                int level = input.nextInt();
                input.nextLine();
                SystemLogger.setLogLevel(level);
            } 
            else if (command.equals("LOG")) {
            	System.out.println("Enter new log level: ");
                int level = input.nextInt();
                input.nextLine();
                
                System.out.println("Enter message: ");
                String message = input.nextLine();
                SystemLogger.log(level, message);
            }
        }

        input.close();
    }
}
