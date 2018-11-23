package at.htl.exam01.document;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Rowlings", "Harry Potter und der Stein der Weisen");
        Email email = new Email("Susi", "Bewerbung", "CoolCompany");
        Book book2 = new Book("Tolkien", "lordOfTheRings");

        Document[] docs = { book, email, book2 };

        for (int i = 0; i < docs.length; i++) {
            if (docs[i] instanceof Book) {
                System.out.println("Book: ");
            }
        }
    }

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */



}
