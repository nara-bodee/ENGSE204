package lab4_11;
import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        if (fontSize < 10) {
            fontSize = 10;
        }
        if (fontSize > 20) {
            fontSize = 20;
        }

        this.theme = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.fontSize = base.fontSize;
        this.darkMode = user.darkMode;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
    }
}

public class lab4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base Theme:");
        String baseTheme = input.nextLine();

        System.out.println("Enter Base Font Size:");
        int baseFontSize = input.nextInt();

        System.out.println("Enter Base Dark Mode:");
        boolean baseDarkMode = input.nextBoolean();
        input.nextLine();

        System.out.println("Enter User Theme:");
        String userTheme = input.nextLine();

        System.out.println("Enter User Font Size:");
        int userFontSize = input.nextInt();

        System.out.println("Enter User Dark Mode:");
        boolean userDarkMode = input.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseFontSize, baseDarkMode);
        Configuration userConfig = new Configuration(userTheme, userFontSize, userDarkMode);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
        input.close();
    }
}
