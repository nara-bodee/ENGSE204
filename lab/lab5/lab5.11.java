package lab5_11;

import java.util.Scanner;

/*
 * Superclass Document
 * Represents a general document
 */
class Document {

    protected String title;

    /*
     * Constructor
     * Initializes document title
     */
    public Document(String title) {
        this.title = title;
    }

    /*
     * Display basic document details
     */
    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

/*
 * Subclass TextDocument
 * Represents a text document with word count
 */
class TextDocument extends Document {

    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    /*
     * Display text document details
     */
    @Override
    public void displayDetails() {
        System.out.println(
                "Text: " + title + ", Words: " + wordCount
        );
    }
}

/*
 * Subclass PDFDocument
 * Represents a PDF document with page count
 */
class PDFDocument extends Document {

    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    /*
     * Display PDF document details
     */
    @Override
    public void displayDetails() {
        System.out.println(
                "PDF: " + title + ", Pages: " + pageCount
        );
    }
}

/*
 * Main class
 * Demonstrates downcasting and instanceof
 */
public class lab5_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Input for TextDocument 1 =====
        System.out.println("Enter title for Text Document 1:");
        String textTitle1 = input.nextLine();

        System.out.println("Enter word count:");
        int wordCount1 = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Input for PDFDocument 1 =====
        System.out.println("Enter title for PDF Document 1:");
        String pdfTitle1 = input.nextLine();

        System.out.println("Enter page count:");
        int pageCount1 = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Input for TextDocument 2 =====
        System.out.println("Enter title for Text Document 2:");
        String textTitle2 = input.nextLine();

        System.out.println("Enter word count:");
        int wordCount2 = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Input for PDFDocument 2 =====
        System.out.println("Enter title for PDF Document 2:");
        String pdfTitle2 = input.nextLine();

        System.out.println("Enter page count:");
        int pageCount2 = input.nextInt();

        // Create document objects
        Document td1 = new TextDocument(textTitle1, wordCount1);
        Document pd1 = new PDFDocument(pdfTitle1, pageCount1);
        Document td2 = new TextDocument(textTitle2, wordCount2);
        Document pd2 = new PDFDocument(pdfTitle2, pageCount2);

        // Store documents in parent-type array (Polymorphism)
        Document[] documents = new Document[4];
        documents[0] = td1;
        documents[1] = pd1;
        documents[2] = td2;
        documents[3] = pd2;

        int totalPages = 0;

        // Loop 1: Calculate total pages from PDF documents only
        for (Document doc : documents) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) doc; // Downcasting
                totalPages += pdf.pageCount;
            }
        }

        // Loop 2: Display details of all documents
        for (Document doc : documents) {
            doc.displayDetails();
        }

        // Display total page count
        System.out.println("Total Pages: " + totalPages);

        input.close();
    }
}
