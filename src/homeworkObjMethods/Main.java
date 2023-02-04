package homeworkObjMethods;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("George", "Orwell");
        System.out.println(author1);
        System.out.println(author2);
        Book book1 = new Book("It", author1, 1990);
        Book book2 = new Book("1984", author2, 1948);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublishingYear(1995);
        System.out.println(book1);
    }
}
