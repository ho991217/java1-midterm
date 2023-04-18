package week7;

public class Book {
    String title;
    String author;
    int ISBN;
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public Book(String title, int ISBN) { // 오버로딩
        this(title, "Anonymous", ISBN);
    }
    public Book() {
        this(null, null, 0); // 생성자의 첫 문장이어야 함
        System.out.println("생성자가 호출됨!");
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

    public static void main(String[] args) {
        Book java = new Book("Java", "Park", 3333);
        Book bible = new Book("Bible", 1);
        Book emptyBook = new Book();
        System.out.println(java);
        System.out.println(bible);
        System.out.println(emptyBook);
    }
}
