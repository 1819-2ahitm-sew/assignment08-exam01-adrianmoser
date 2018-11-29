package at.htl.exam01.document;

public class Main {

    public static void main(String[] args) {

        int eCounter = 0;
        int bCounter = 0;

        Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");
        Book book1 = new Book("Tolkien", "lordOfTheRings");

        Document[] docs = new Document[3];

        docs[0] = book;
        docs[1] = email;
        docs[2] = book1;

        for (int i = 0; i < docs.length; i++) {
            System.out.println(docs[i]);
            if (docs[i] instanceof Book) {
                bCounter++;
            } else {
                eCounter++;
            }
        }
        System.out.println();

        System.out.printf("Anzahl Books: %d%n", bCounter);
        System.out.printf("Anzahl Emails: %d", eCounter);

    }
}
