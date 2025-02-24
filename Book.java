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
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; //Exercise 2.85: Added a field of pages of type int.
    private int borrowed;
    private String refNumber; //Exercise 2.88: Added a field of refNumber of type String.
    private boolean courseText; //Exercise 2.92 Added field of courseText of tyope boolean.

    /**
     * Set the author, title fields and pages when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; //Exercise 2.85: Added pages into constructor.
        refNumber = ""; //Exercise 2.88 Build the constructor for refNumber.
        borrowed = 0;
        courseText = false; //Exercise 2.92
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
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
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
            System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages + ", "  +
            "refNumber: " + refNumber + " Borrowed: " + borrowed);
        }
        else
        {
            System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + pages + ", "  +
            "refNumber: " + "ZZZ" + " Borrowed: " + borrowed);
        }
    }
    
    //Exercise 2.88 Created mutator method for setRefNumber that will assign the string to refNumber.
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) //if String is greater then or equal to 3.
        {
            refNumber = ref; //Assigning string to refNumber
        }
        else
        {
            System.out.println("refNumber must be atleast 3 characters long");//else print this error message.
        }
    }
    
    //Exercise 2.91 This method will increment the number of times book has been borrowed.
    public void setBorrow()
    {
        borrowed = borrowed + 1;
    }

    // Add the methods here ...
}
