/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Damian Davila
 * @version February 3, 2025
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    //accessor method getAuthor() will return author.
    public String getAuthor()
    {
        return author;
    }
    
    //accessor method getTitle() will return tile.
    public String getTitle()
    {
        return title;
    }

    // Add the methods here ...
}
