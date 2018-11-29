package at.htl.exam01.document;

public class Email extends Document {

    private String subject;
    private String to;

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public Email(String author, String subject, String to) {
        super(author);
        this.subject = subject;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("Email: %s von %s an %s", subject, getAuthor(), to );
    }
}
