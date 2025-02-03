/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Damian Davila
 * @version February 3, 2025
 */

/**
 * Exercise 2.86 Are the Book objects you have implemented immutable? Justicy your answer.
 * 
 * Yes, the objects are immutable because in order to create an object you must set (author, title and page number)
 * and once created it cannot be changed or edit.
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; //Exercise 2.85: Added a field of pages of type int.
    private String refNumber; //Exercise 2.88: Added a field of refNumber of type String.

    /**
     * Set the author, title fields and pages when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; //Exercise 2.85: Added pages into constructor.
        refNumber = ""; //Exercise 2.88 Build the constructor for refNumber.
    }
    
    //Exercise 2.83: accessor method getAuthor() will return author.
    public String getAuthor()
    {
        return author;
    }
    
    //Exercise 2.83: accessor method getTitle() will return tile.
    public String getTitle()
    {
        return title;
    }
    
    //Exercise 2.88: accessor method getRefNumber() will return refNumber.
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //Exercise 2.85: accessor method getPages() will return number of pages.
    public int getPages()
    {
        return pages;
    }
    
    //Exercise 2.84: Added mutator method printAuthor() that should print out author in the terrminal window.
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    //Exercise 2.84: Added mutator method printTitle() that should print out author in the terrminal window.
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * Exercise 2.87: Added mutator method printDetails() that should print details of the author, 
     * title and pages to terminal window
     * 
     * Exercise 2.89: Modified the print details method.
     */
    public void printDetails()
    {
        if(refNumber.length() > 0)
        {
            print refNumber;    
        }
        else
        {
            print "ZZZ"
        }
        
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages + ", "  +
        "refNumber: " + refNumber);
    }
    
    //Exercise 2.88 Created mutator method for setRefNumber that will assign the string to refNumber.
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }

    // Add the methods here ...
}
