public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages){
        this.author = author;
        this.genre = genre;
        this.title = title;
        this.numPages = numPages;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getNumPages(){
        return numPages;
    }

    public void printBookDetails(){
        System.out.print(this.getTitle());
        System.out.print(" by " + this.getAuthor());
        System.out.print(" has " + this.getNumPages() + " pages");
        System.out.println(" and its genre is " + this.getGenre());
        System.out.println();
    }
}
