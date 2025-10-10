import java.util.ArrayList;
import java.util.List;

public class Book{
    private String title;
    private String author;
    private String userRating;
    private String reviews;
    private String price;
    private String year;
    private String genre;

    //constructor
    public Book(String title, String author, String userRating, String reviews, String price, String year, String genre){
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }

    //getters
    public String getTitle(){
        return title;
    }   
    public String getAuthor(){
        return author;
    }
    public String getUserRating(){
        return userRating;

    }   
    public String getReviews(){
        return reviews;
    }
    public String getPrice(){
        return price;
    }
    public String getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    public void setReviews(String reviews){
        this.reviews = reviews;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
      
    public void printDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("User Rating: " + userRating);
    System.out.println("Reviews: " + reviews);
    System.out.println("Price: " + price);
    System.out.println("Year: " + year);
    System.out.println("Genre: " + genre);
    System.out.println("------------------------------");
}

public static int countBooksByAuthor(List<Book> books, String authorName){
        int count = 0;
        for (Book book : books){
            if (book.getAuthor().equals(authorName)){
                count = count + 1;
            }
        }
        return count;
    }

public static List<String> getAllAuthors(List<Book> books){
    List<String> authors = new ArrayList<>();
    for (Book book : books) {
        String author = book.getAuthor();
        if (!authors.contains(author)){
            authors.add(author);
        }
    }
    return authors;
}

public static List<String> getBooksByAuthor(List<Book> books, String AuthorName){
    List<String> BookList = new ArrayList<>();
    for (Book book: books) {
        if (book.getAuthor().equals(AuthorName)){
            BookList.add(book.getTitle());
        }
    }
    return BookList;
    }

public static List<String> getBooksByRating(List<Book> books, String userRating){
    List<String> BookByRatings = new ArrayList<>();
    for (Book book : books){
        if (book.getUserRating().equals(userRating)){
            BookByRatings.add(book.getTitle());
        }
    }
    return BookByRatings;
}

public static List<String> getBooksAndPricebyAuthor(List<Book> books, String authorName){
    List<String> BooksAndPrice = new ArrayList<>();
    for (Book book: books){
        if (book.getAuthor().equals(authorName)){
            String info = book.getTitle() + "-$" + book.getPrice();
            BooksAndPrice.add(info);
        }
    }
    return BooksAndPrice;
}
}





