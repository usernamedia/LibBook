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
            System.out.println("📚 === Library Book Manager ===");
            System.out.println("1️⃣ Add Book");
            System.out.println("2️⃣ View Books");
            System.out.println("3️⃣ Update Book");
            System.out.println("4️⃣ Delete Book");
            System.out.println("5️⃣ Exit");
            System.out.print("👉 Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    libraryService.addBook(scanner);
                    break;
                case "2":
                    libraryService.viewBooks();
                    break;
                case "3":
                    libraryService.updateBook(scanner);
                    break;
                case "4":
                    libraryService.deleteBook(scanner);
                    break;
                case "5":
                    System.out.println("👋 Goodbye!");
                    return;
                default:
                    System.out.println("❗ Invalid option!\n");
            }
        }
    }
}

