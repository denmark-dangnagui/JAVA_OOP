package tostring;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                        ", author='" + author + '\'';
    }
}

public class ToStringTest {

    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");
        System.out.println(book);


    }
}
