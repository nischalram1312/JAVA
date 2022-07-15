package Nischal.company;

class Library{
    String [] books;
    int no_books;

    Library(){
        this.books=new String[100];
        this.no_books=0;
    }

    public void addBook(String Book){
        this.books[no_books]=Book;
        no_books++;
        System.out.println(Book+" has been added to the library");
    }

    public void availableBooks (){
        System.out.println("*********available books********");
        for(String book : this.books) {
            if(book==null) {
                continue;
            }
            System.out.println("-> " + book);
        }
    }

    public void issueBook(String Book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equalsIgnoreCase(Book)){
                this.books[i]= null;
                System.out.println(Book+" Has been issued from the library");
                break;
            }
            System.out.println(Book+" Has been issued");
        }
    }

    public void returnBook(String Book){
        addBook(Book);
    }
}

public class Main {

    public static void main(String[] args) {
        Library NischalLibrary = new Library();
        NischalLibrary.addBook("Half Girlfriend");
        NischalLibrary.addBook("Monk who sold his ferrari");
        NischalLibrary.addBook("Subtle art of not giving a fuck");
        NischalLibrary.addBook("Hunger Games");
        NischalLibrary.addBook("Percy Jackson");
        NischalLibrary.addBook("Harry Potter");
        NischalLibrary.availableBooks();
        NischalLibrary.issueBook("half girlfriend");
        NischalLibrary.availableBooks();





    }
}
