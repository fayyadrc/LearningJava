
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        DatasetReader reader = new DatasetReader();
        List<Book> books = reader.readDataset("Amazon Dataset/data.csv");

        //Task I: Total number of books by an author
        String authorName = "J.K. Rowling";
        int bookCount = Book.countBooksByAuthor(books, authorName);
        System.out.println("Total number of books by" + authorName + ": " + bookCount);

        //Task II: All the authors in the dataset
        List<String> authors = Book.getAllAuthors(books);
        System.out.println("All unique authors:");
        for (String author : authors) {
           System.out.println(author);
        }
        
        //Task III: Names of all the books by an author
        String authorName = "J.K. Rowling";
        List<String> authorBooks = Book.getBooksByAuthor(books, authorName);

        for (String book : authorBooks) {
            System.out.println(book);
        }

        //Task IV: Classify with a user rating
        String userRating = "4.9";
        List <String> booksByRating = Book.getBooksByRating(books, userRating);
        for (String book : booksByRating){
          System.out.println(book);
        }

        //Task V: Price of all the books by an author
        String authorName = "J.K. Rowling";
        List<String> priceBooks = Book.getBooksAndPricebyAuthor(books, authorName);
        for (String book : priceBooks){
          System.out.println(book);
        }
        
    }

}
