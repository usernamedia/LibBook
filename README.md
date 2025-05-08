# LIBRARY BOOK MANAGER 

## Presentation
(link)

**Student Name:** Sogdiana Arasheva

---

## Description

The Library Book Manager is a Java-based console application designed to manage a library's book collection. It supports operations such as adding, viewing, updating, deleting, searching, and sorting books. All data is stored in a CSV file, ensuring persistence between program sessions. The project demonstrates key programming concepts such as object-oriented design, modular structure, exception handling, file I/O, and Java collections.

---

## Objectives

### Book Management
- Add, view, update, and delete books
- Each book contains: ID, title, author, year

![image](https://github.com/user-attachments/assets/c86b8065-b484-40ca-9f17-27436ba815a2)


---

### Search and Filter
- Search books by title or author
- Filter books published after a given year

![image](https://github.com/user-attachments/assets/c99ebdcf-262c-4b18-b4e4-c79b6d4c300d)
![image](https://github.com/user-attachments/assets/f55ac8f0-1304-4be6-8ec3-b034763069e5)
![image](https://github.com/user-attachments/assets/7560384b-1904-48a9-be6b-b004faf8edf2)

---

### Data Persistence
- Automatically saves all book records in `books.csv`
- Automatically loads books on program startup

![image](https://github.com/user-attachments/assets/ae41c780-033a-4a46-9bea-62dcdd78184d)


---

### Reporting and Analysis
- Count total number of books
  ![image](https://github.com/user-attachments/assets/c204f788-9194-42b9-97f3-e44d3da679c4)

---

### Error Handling
- Rejects invalid inputs and non-existent IDs
- Uses `try-catch` to prevent application crashes
- Ensures user-friendly error messages

![image](https://github.com/user-attachments/assets/0d71095f-d22e-4ec3-84bd-45f604e100e7)
![image](https://github.com/user-attachments/assets/c4f1e50d-6b36-4688-9378-904b741b91d5)

---

## Project Requirement List

1. **Add Book**
    - Add a new book with title, author, and year
    - Automatically assign a unique book ID
    - Persist to `books.csv`
  ![image](https://github.com/user-attachments/assets/09550ef3-7e46-4068-94b0-1f6ff9c0cab4)

2. **View All Books**
    - Display all books in a clean format
    - Show ID, title, author, and year
![image](https://github.com/user-attachments/assets/2b3afbbf-36ea-4a9e-80e1-c72d953bebec)

3. **Update Book**
    - Modify a book's title, author, or year using its ID
    - Save changes to the file
![image](https://github.com/user-attachments/assets/951ccf7a-6551-4a30-b172-d8279df274a1)

4. **Delete Book**
    - Remove a book by its ID after confirmation
    - Update `books.csv` accordingly
![image](https://github.com/user-attachments/assets/faa0b89f-673d-4158-9e67-e15830d9d17b)

5. **Search by Title**
    - Search for books containing keywords in the title
    - Case-insensitive matching
![image](https://github.com/user-attachments/assets/635ba536-afbb-4957-b088-86fc662cd3e6)


6. **Search by Author**
    - Find all books by a specific author
    - Support partial name matching
![image](https://github.com/user-attachments/assets/cf92d1c8-b5ea-4a1c-b13d-5a02d6c9ccd8)

7. **View Books After Year**
    - List all books published after a specified year
![image](https://github.com/user-attachments/assets/73c2c0cd-7dd9-46ea-bf86-5f5ea30d36a3)

8. **Sort Books by Title**
    - Sort all books alphabetically by their title
![image](https://github.com/user-attachments/assets/f0446e59-d21f-44a9-8032-8a3c9d7d27ae)

9. **Count Total Books**
    - Display total number of books in the system
![image](https://github.com/user-attachments/assets/05c48bd7-4e4d-4483-8059-ee494307ec5c)

10. **List Books Alphabetically**
    - Sorts and displays all books in alphabetical order by title
![image](https://github.com/user-attachments/assets/28d4d689-fa21-4418-88ec-2961c63d49e5)

11. **Exit Program**
    - Gracefully exits the application
![image](https://github.com/user-attachments/assets/20c8fb74-b3b8-4de5-8c78-749f8c4a93e3)

---

## Documentation

### Data Structures
- `List<Book>` — stores all books during runtime
  ![image](https://github.com/user-attachments/assets/13db39c5-48d5-450f-88b0-ec9620739e57)

- `Book` — a class representing each book object (id, title, author, year)
![image](https://github.com/user-attachments/assets/bd19ffb5-199e-4acb-a32f-67a5aed4a25c)

### File Paths and Constants
- `books.csv` – The path to the CSV file that stores all book data persistently between sessions

### Error Handling

Implemented using `try-catch` blocks:

- For file operations (`IOException`)
- For numeric input conversion (`NumberFormatException`)
- For general validation and error prevention (e.g., ID not found, year format)
- ![image](https://github.com/user-attachments/assets/f0fad5ee-1a03-4ba4-b9ad-84a727fd7aa9)


---

### Switch Statements

Used in menu navigation:

- `Main.java` – Handles the main menu loop
- `Menu.java` – Displays menu options and processes user input
![image](https://github.com/user-attachments/assets/f9f6af00-b7f5-4b14-8aa2-7e2f7829d732)

Each case corresponds to a specific operation (e.g., add book, delete book, view books)

---
## File Import/Export
**Importing Books from CSV:**
![image](https://github.com/user-attachments/assets/9cdcae10-e375-4ea8-8d06-342252956af5)


**Exporting Books to CSV:**
![image](https://github.com/user-attachments/assets/5b1f819d-e5cb-466c-a0c5-aa335c2553fa)


All book details are written line by line in CSV format using `BufferedWriter`, which ensures efficient writing and automatic resource management through the try-with-resources block.
