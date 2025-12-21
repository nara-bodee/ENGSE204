package lab4_15;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;

    private static int maxMessages = 3;

    // Constructor 1 (Chaining)
    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    // Constructor 2 (Main Constructor)
    public AuditRecord(String user, String[] logs) {
        this.user = user;

        if (logs.length > maxMessages) {
            this.logMessages = new String[maxMessages];
            int start = logs.length - maxMessages;
            for (int i = 0; i < maxMessages; i++) {
                this.logMessages[i] = logs[start + i];
            }
        } else {
            this.logMessages = new String[logs.length];
            for (int i = 0; i < logs.length; i++) {
                this.logMessages[i] = logs[i];
            }
        }
    }

    // Static Policy Setter
    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    // Immutable addMessage
    public AuditRecord addMessage(String message) {
        if (logMessages.length >= maxMessages) {
            System.out.println("Log is full.");
            return this;
        }

        String[] newLogs = new String[logMessages.length + 1];
        for (int i = 0; i < logMessages.length; i++) {
            newLogs[i] = logMessages[i];
        }
        newLogs[newLogs.length - 1] = message;

        System.out.println(message + " added.");
        return new AuditRecord(this.user, newLogs);
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class lab4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter max policy:");
        int max = input.nextInt();
        input.nextLine();
        AuditRecord.setMaxMessages(max);

        System.out.println("Enter user name:");
        String user = input.nextLine();

        AuditRecord record = new AuditRecord(user);

        System.out.println("Enter number of logs:");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter log message:");
            String msg = input.nextLine();

            if (msg.equals("SET_POLICY")) {
                System.out.println("Enter new policy:");
                int newPolicy = input.nextInt();
                input.nextLine();
                AuditRecord.setMaxMessages(newPolicy);
            } else {
                record = record.addMessage(msg);
            }
        }

        record.displayLog();
        input.close();
    }
}
