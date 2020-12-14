import java.util.Scanner;

public class ManagerBook {
    private Book[] books=new Book[0];

    final Scanner scanner = new Scanner(System.in);

    public void addNewBook(Book book) {
        Book[] newBooks = new Book[this.books.length + 1];
        for (int i = 0; i < this.books.length; i++) {
            newBooks[i] = this.books[i];
        }
        newBooks[newBooks.length - 1] = book;
        this.books=newBooks;
    }

    public void editBookByIndex(int index) {
        System.out.println("Edit: name, author, price, amount, weight.");
        Book newBook = new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
        books[index] = newBook;
    }

    public int getMaxPrice() {
        if(books.length==0) return -1;
        int maxPrice=books[0].getPrice();
        for (Book book : books) {
            if(maxPrice<book.getPrice()) maxPrice=book.getPrice();
        }
        return maxPrice;
    }

    public double getSumPrice(){
        double sumPrice=0;
        for(Book book:books){
            sumPrice+=book.getPrice();
        }
        return sumPrice;
    }
    public void printListBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}
