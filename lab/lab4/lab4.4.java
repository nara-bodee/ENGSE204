package lab4_4;
import java.util.Scanner;

class Location {
	private double latitude;
    private double longitude;
    
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }
    
    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }
    
    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}
public class lab4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter InitialLat");
		double initialLat = input.nextDouble();
		System.out.println("Enter InitialLon");
		double initialLon = input.nextDouble();
		System.out.println("Enter New latitude");
		double newLat = input.nextDouble();
		
		Location loc1 = new Location(initialLat, initialLon);
		
		Location loc2 = new Location(loc1);
		
		loc1.setLatitude(newLat);
		
		loc1.displayInfo();
        loc2.displayInfo();

        input.close();
	}

}
