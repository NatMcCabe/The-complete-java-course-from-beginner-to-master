public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George RR Martin", "Game of Thrones", "Fantasy", 864);
        Book mathsBook = new Book("James Stewart", "Calculus", "Maths", 1392);
        Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);

        gameOfThrones.printBookDetails();
        mathsBook.printBookDetails();
        javaBook.printBookDetails();
    }
}
