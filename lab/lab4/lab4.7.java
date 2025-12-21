package lab4_7;
import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize(); 
    }
}

public class lab4_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ID1:");
        String id1 = input.nextLine();
        System.out.println("Enter ID2:");
        String id2 = input.nextLine();
        System.out.println("Enter ID3:");
        String id3 = input.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;
        System.gc();
        
        r3 = null;
        System.gc();

        input.close();
    }
}
        
