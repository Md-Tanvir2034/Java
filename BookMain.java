class Book {
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;

    private static int uniqueBookCounter = 0 ;

    public Book() {
        System.out.println("E-constructor");
        uniqueBookCounter++ ;
     }
  
     public Book(String bookName, String bookAuthor, String bookId, String bookType , int bookCopy) {
        System.out.println("p-constructor");
        this.setbookName(bookName);
        this.setbookAuthor(bookAuthor);
        this.setbookId(bookId);
        this.setbookType(bookType);
        this.setbookCopy(bookCopy);
        uniqueBookCounter++ ;
     }
  
     public void setbookName(String bookName) {
        this.bookName = bookName;
     }
  
     public String getbookName() {
        return this.bookName;
     }
  
     public void setbookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
     }
  
     public String getbookAuthor() {
        return this.bookAuthor;
     }
  
     public void setbookId(String bookId) {
        this.bookId = bookId;
     }
  
     public String getbookId() {
        return this.bookId;
     }
  
     public void setbookType(String bookType) {
        this.bookType = bookType ;
        
     }
  
     public String getbookType() {
        return this.bookType;
     }
     
     public void setbookCopy(int bookCopy) {
        this.bookCopy = bookCopy ;
        
     }
  
     public int getbookCopy() {
        return this.bookCopy;
     }

   
      public void showdDetails() {
         System.out.println("--------");
         System.out.println("book Name : " + this.bookName);
         System.out.println("book author : " + this.bookAuthor);
         System.out.println("book id : " + this.bookId);
         System.out.println("book type : " + this.bookType);
         System.out.println("book number : " + this.bookCopy);
   
      }

      public void addBookCopy(int x){
         this.bookCopy +=x ;
      }
     
     public static void totalNumberOfUniqueBooks(){
        System.out.println("Total number of unique books: " + uniqueBookCounter);
     }

    
}

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.showdDetails();
        
        Book book2 = new Book("C++" , "Oishik" , "24-60391-3" , "coding" , 12);
        book2.showdDetails();
        book2.addBookCopy(5);
        book2.showdDetails();

        Book book3 = new Book("python" , "Rifath" , "24-60395-3" , "coding" , 15);
        book3.showdDetails();
        Book book4 = new Book("java" , "Tanvir" , "24-60390-3" , "coding" , 10) ;
        book4.showdDetails();
        Book.totalNumberOfUniqueBooks();
    }
    
}
