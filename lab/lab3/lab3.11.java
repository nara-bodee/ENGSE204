package lab3_11;
import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        serverUrl = "default.server.com";
        maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class lab3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
        	System.out.println("Enter Command (SET_MAX/SET_MAX/SHOW):");
            String cmd = input.next();

            if (cmd.equals("SET_URL")) {
            	System.out.println("Enter URL:");
                String newUrl = input.next();
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(newUrl);
            }

            else if (cmd.equals("SET_MAX")) {
            	System.out.println("Enter MAX:");
                int newMax = input.nextInt();
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(newMax);
            }

            else if (cmd.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
    }
}

