public class TextBook extends Book
{
    private String subject;
    private String edition;
    
    public TextBook(String title, String author, 
                String subject, String edition)
    {
        super(title, author);
        this.subject = subject;
        this.edition = edition;
    }
    
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    
    public String getEdition()
    {
        return edition;
    }
    public void setEdition()
    {
        this.edition = edition;
    }
    
}
