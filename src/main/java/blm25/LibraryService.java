package blm25;

import java.util.*;

public class LibraryService {
    private List<Book> books;

    public LibraryService() {
        books = FileHandler.loadBooks();
    }

    public void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter book year: ");
        int year = Integer.parseInt(scanner.nextLine().trim());

        int id = getNextId();
        books.add(new Book(id, title, author, year));
        FileHandler.saveBooks(books);
        System.out.println("Book added successfully!\n");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.\n");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void updateBook(Scanner scanner) {
        System.out.print("Enter book ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found!\n");
            return;
        }

        System.out.print("New title: ");
        book.setTitle(scanner.nextLine().trim());
        System.out.print("New author: ");
        book.setAuthor(scanner.nextLine().trim());
        System.out.print("New year: ");
        book.setYear(Integer.parseInt(scanner.nextLine().trim()));
        FileHandler.saveBooks(books);
        System.out.println("Book updated successfully!\n");
    }

    public void deleteBook(Scanner scanner) {
        System.out.print("Enter book ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found!\n");
            return;
        }
        books.remove(book);
        FileHandler.saveBooks(books);
        System.out.println("Book deleted successfully!\n");
    }

    public void searchByTitle(Scanner scanner) {
        System.out.print("Enter title keyword: ");
        String keyword = scanner.nextLine().trim().toLowerCase();
        books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword))
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByAuthor(Scanner scanner) {
        System.out.print("Enter author keyword: ");
        String keyword = scanner.nextLine().trim().toLowerCase();
        books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(keyword))
                .forEach(System.out::println);
        System.out.println();
    }

    public void findBooksAfterYear(Scanner scanner) {
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        books.stream()
                .filter(book -> book.getYear() > year)
                .forEach(System.out::println);
        System.out.println();
    }

    public void sortBooksByYear() {
        books.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .forEach(System.out::println);
        System.out.println();
    }

    public void countBooks() {
        System.out.println(" Total number of books: " + books.size() + "\n");
    }

    public void listBooksAlphabetically() {
        if (books.isEmpty()) {
            System.out.println(" No books available.\n");
            return;
        }

        books.stream()
                .sorted(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER))
                .forEach(System.out::println);
        System.out.println();
    }


    private int getNextId() {
        return books.stream().mapToInt(Book::getId).max().orElse(0) + 1;
    }

    private Book findBookById(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }



}
