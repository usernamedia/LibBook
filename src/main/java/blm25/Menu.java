package blm25;

import java.util.Scanner;

public class Menu {
    private LibraryService libraryService;
    private Scanner scanner;

    public Menu() {
        libraryService = new LibraryService();
        scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("=== Library Book Manager ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Search Book by Title");
            System.out.println("6. Search Book by Author");
            System.out.println("7. Find Books After Year");
            System.out.println("8. Sort Books by Year");
            System.out.println("9. Count Total Books");
            System.out.println("10. List Books Alphabetically");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1": libraryService.addBook(scanner); break;
                case "2": libraryService.viewBooks(); break;
                case "3": libraryService.updateBook(scanner); break;
                case "4": libraryService.deleteBook(scanner); break;
                case "5": libraryService.searchByTitle(scanner); break;
                case "6": libraryService.searchByAuthor(scanner); break;
                case "7": libraryService.findBooksAfterYear(scanner); break;
                case "8": libraryService.sortBooksByYear(); break;
                case "9": libraryService.countBooks(); break;
                case "10": libraryService.listBooksAlphabetically(); break;
                case "11": System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid option!\n");
            }
        }
    }
}