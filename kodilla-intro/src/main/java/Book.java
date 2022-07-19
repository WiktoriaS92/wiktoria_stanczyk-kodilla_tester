public class Book {
    private String author;
    private String title;

    public static Book of(String bookAuthor, String bookTitle) {
        var book = new Book();
        book.author = bookAuthor;
        book.title = bookTitle;
        return  book;
    }
}
