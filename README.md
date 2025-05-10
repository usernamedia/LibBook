# LIBRARY BOOK MANAGER 

## Presentation
(сюда ссылку от презентации)

**Student Name:** Sogdiana Arasheva

---

## Description

The Library Book Manager is a Java-based console application designed to manage a library's book collection. It supports operations such as adding, viewing, updating, deleting, searching, and sorting books. All data is stored in a CSV file, ensuring persistence between program sessions. The project demonstrates key programming concepts such as object-oriented design, modular structure, exception handling, file I/O, and Java collections.

---

## Objectives

### Book Management
- Add, view, update, and delete books
- Each book contains: ID, title, author, year

(сюда фотку от главного меню)

---

### Search and Filter
- Search books by title or author
- Filter books published after a given year

(сюда фотку от таких функций)

---

### Data Persistence
- Automatically saves all book records in `books.csv`
- Automatically loads books on program startup

(сюда фотку от сисиви)

---

### Reporting and Analysis
- Count total number of books
- View a book by its ID
- Sort books by title

(сюда фотку от этих функций)

---

### Error Handling
- Rejects invalid inputs and non-existent IDs
- Uses `try-catch` to prevent application crashes
- Ensures user-friendly error messages

(сюда фотку от этой фнкции )

---

## Project Requirement List

1. **Add Book**
    - Add a new book with title, author, and year
    - Automatically assign a unique book ID
    - Persist to `books.csv`

2. **View All Books**
    - Display all books in a clean format
    - Show ID, title, author, and year

3. **Update Book**
    - Modify a book's title, author, or year using its ID
    - Save changes to the file

4. **Delete Book**
    - Remove a book by its ID after confirmation
    - Update `books.csv` accordingly

5. **Search by Title**
    - Search for books containing keywords in the title
    - Case-insensitive matching

6. **Search by Author**
    - Find all books by a specific author
    - Support partial name matching

7. **View Books After Year**
    - List all books published after a specified year

8. **Sort Books by Title**
    - Sort all books alphabetically by their title

9. **Count Total Books**
    - Display total number of books in the system

10. **List Books Alphabetically**
    - Sorts and displays all books in alphabetical order by title

11. **Exit Program**
    - Gracefully exits the application

---

## Documentation

### Data Structures
- `List<Book>` — stores all books during runtime
- `Book` — a class representing each book object (id, title, author, year)

### File Paths and Constants
- `books.csv` – The path to the CSV file that stores all book data persistently between sessions

### Error Handling

Implemented using `try-catch` blocks:

- For file operations (`IOException`)
- For numeric input conversion (`NumberFormatException`)
- For general validation and error prevention (e.g., ID not found, year format)
  (сюда фоточку )

---

### Switch Statements

Used in menu navigation:

- `Main.java` – Handles the main menu loop
- `Menu.java` – Displays menu options and processes user input

Each case corresponds to a specific operation (e.g., add book, delete book, view books)

---

## String Processing for CSV

**Serialization (Object → CSV String):**

```java
pw.println(book.getId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getYear());

## Deserialization (CSV String → Object)

```java
String[] parts = line.split(",", 4);
// parts[0] = id, parts[1] = title, parts[2] = author, parts[3] = year

---
## File Import/Export
**Importing Books from CSV:**
(фоточку)

**Exporting Books to CSV:**
(фоточку)

All book details are written line by line in CSV format using `BufferedWriter`, which ensures efficient writing and automatic resource management through the try-with-resources block.






