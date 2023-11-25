class Library {

    String[] books;
    int no_of_books = 0;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added!");
    }

    void showAvailablebooks() {
        System.out.println("Available Books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issuebook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The Book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book does not exist");
    }

    void returnbook(String book) {
        addbook(book);
    }

}

public class DigitalLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addbook("Do Epic Shit");
        centralLibrary.addbook("Think like a Monk");
        centralLibrary.addbook("Life's Amazing Secrets");
        centralLibrary.showAvailablebooks();
        centralLibrary.issuebook("Do Epic Shit");
        centralLibrary.showAvailablebooks();
        centralLibrary.returnbook("Do Epic Shit");
        centralLibrary.showAvailablebooks();

    }
}
