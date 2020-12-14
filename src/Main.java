import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ManagerBook lib=new ManagerBook();
        System.out.println("1/ use feature!");
        System.out.println("2/ get out!");
        while (scanner.nextInt() == 1) {
            System.out.println("1/ add a book!");
            System.out.println("2/ edit a book!");
            System.out.println("3/ get max price book!");
            System.out.println("4/ get sum price books!");
            if (scanner.nextInt() == 1) {
                System.out.println("Type: name, author, price, amount, weight:");
                lib.addNewBook(new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble()));
            } else if (scanner.nextInt() == 2) {
                System.out.println("what is index of book you want to edit?");
                lib.editBookByIndex(scanner.nextInt());
            } else if (scanner.nextInt() == 3) {
                System.out.println(lib.getMaxPrice());
            } else if (scanner.nextInt() == 4) {
                System.out.println(lib.getSumPrice());
            }
            System.out.println("1/ use feature!");
            System.out.println("2/ get out!");
        }

    }
}
