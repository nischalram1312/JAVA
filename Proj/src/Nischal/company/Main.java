package Nischal.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString() {
        return "[Book" +
                "name='" + name + '\'' +
                ", author='" + author + '\''+"]"
                ;
    }
}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
            this.books = books;
    }
    public void addBook(Book book){
        System.out.println("Book"+book+" has been added");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("Book "+book+" has been issued from the library to "+issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("Book "+b+" has been returned to the library");
        this.books.add(b);
    }
}
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("DSA","Nischal");
        bk.add(b1);

        Book b2 = new Book("DSA2","Ram");
        bk.add(b2);

        Book b3 = new Book("DSA3","Raghu");
        bk.add(b3);

        Book b4 = new Book("Algorithms4", "CLRS4");
        bk.add(b4);

        Library l = new Library(bk);
        l.addBook(new Book("algo","author"));
        System.out.println(l.books);
        l.issueBook(b1,"Puvvala");
     }
}
