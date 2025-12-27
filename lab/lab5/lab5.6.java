package lab5_6;
import java.util.Scanner;

/*
 * Superclass Media
 * Used as a parent type for all media objects
 */
class Media {

    protected String title;

    /*
     * Constructor
     * Initializes media title
     */
    public Media(String title) {
        this.title = title;
    }

    /*
     * Default process method
     * Will be overridden by subclasses
     */
    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

/*
 * Subclass Video
 * Overrides process() for video-specific behavior
 */
class Video extends Media {

    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println(
            "Processing video: " + title + " for " + duration + " minutes."
        );
    }
}

/*
 * Subclass Audio
 * Overrides process() for audio-specific behavior
 */
class Audio extends Media {

    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println(
            "Processing audio: " + title + " with " + quality + " quality."
        );
    }
}

/*
 * Utility class Processor
 * Demonstrates polymorphism via Media parameter
 */
class Processor {

    public static void runProcessor(Media m) {
        // Polymorphism: correct process() is called automatically
        m.process();
    }
}

/*
 * Main class
 * Handles input and controls program flow
 */
public class lab5_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Receive input for Video
        System.out.println("Enter video title:");
        String videoTitle = input.nextLine();

        System.out.println("Enter video duration:");
        int duration = input.nextInt();
        input.nextLine(); // clear buffer

        // Receive input for Audio
        System.out.println("Enter audio title:");
        String audioTitle = input.nextLine();

        System.out.println("Enter audio quality:");
        String quality = input.nextLine();

        // Create media objects
        Video video = new Video(videoTitle, duration);
        Audio audio = new Audio(audioTitle, quality);

        // Process media using a single method (Polymorphism)
        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        input.close();
    }
}
