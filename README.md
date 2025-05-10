# LIBRARY BOOK MANAGER

## Presentation
https://www.canva.com/design/DAGjdpZy16A/xn52IGqLdpOI_BFju0V3eA/view?utm_content=DAGjdpZy16A&utm_campaign=designshare&utm_medium=link2&utm_source=uniquelinks&utlId=h658f8ecd0d
---
**Student Name:** Sogdiana Arasheva
---

## Description

The Library Book Manager is a Java-based console application designed to manage a library's book collection. It supports operations such as adding, viewing, updating, deleting, searching, and sorting books. All data is stored in a CSV file, ensuring persistence between program sessions. The project demonstrates key programming concepts such as object-oriented design, modular structure, exception handling and Java collections.

---

## Objectives

### Book Management
- Add, view, update, and delete books
- Each book contains: ID, title, author, year

![image](https://github.com/user-attachments/assets/a45e7366-28c9-4f31-83b4-0596d53e8721)

---

### Data Persistence
- Automatically saves all book records in `books.csv`
- Automatically loads books on program startup

![image](https://github.com/user-attachments/assets/7b0261e6-620c-477e-96e7-4611292f2927)
---
### Reporting and Analysis
- Count total number of books
![image](https://github.com/user-attachments/assets/785f10d9-e8a2-460b-a555-64dd2329325f)
---
### Error Handling
- Rejects invalid inputs and non-existent IDs
- Uses `try-catch` to prevent application crashes
- Ensures user-friendly error messages
![image](https://github.com/user-attachments/assets/2c76570b-dbd6-4351-abd3-672d7a379268)

---

## Project Requirement List
1. **Add Book**
    - Add a new book with title, author, and year
    - Automatically assign a unique book ID
    - Persist to `books.csv`
![image](https://github.com/user-attachments/assets/034018d3-4ef5-4917-8a4f-5777463ffd83)

2. **View All Books**
    - Display all books in a clean format
    - Show ID, title, author, and year
![image](https://github.com/user-attachments/assets/1a2df697-7d70-4a4a-9447-5e9e89c1dee8)

3. **Update Book**
    - Modify a book's title, author, or year using its ID
    - Save changes to the file
![image](https://github.com/user-attachments/assets/ff070e81-2e39-4cce-990b-d25fac394660)

4. **Delete Book**
    - Remove a book by its ID after confirmation
    - Update `books.csv` accordingly
![image](https://github.com/user-attachments/assets/ca64f0fa-d082-44b8-afea-e47b323a0759)

5. **Search by Title**
    - Search for books containing keywords in the title
    - Case-insensitive matching
![image](https://github.com/user-attachments/assets/230398de-1c16-43ed-8fff-a7392e927d8d)

6. **Search by Author**
    - Find all books by a specific author
    - Support partial name matching
![image](https://github.com/user-attachments/assets/e5c0510e-586c-45ca-a729-654cfaece529)

7. **Find Books After Year**
    - List all books published after a specified year
![image](https://github.com/user-attachments/assets/f31fa539-b2f6-4024-90cb-93437953817d)

8. **Sort Books by Year**
    - Sort all books by their year of publishment
![image](https://github.com/user-attachments/assets/0e805af1-ea25-4715-b5fc-11f75302d510)

9. **Count Total Books**
    - Display total number of books in the system
![image](https://github.com/user-attachments/assets/054d3131-9a05-4642-a9a5-d50a3499d9b6)

10. **List Books Alphabetically**
    - Sorts and displays all books in alphabetical order by title
![image](https://github.com/user-attachments/assets/6a78c9c2-6933-4828-8eb4-c11d148e1876)

11. **Exit Program**
    - Gracefully exits the application
![image](https://github.com/user-attachments/assets/22809896-6370-4cd6-b4ec-5b54758ce4a2)
---
## Documentation
### Data Structures
- `List<Book>` — stores all books during runtime
- `Book` — a class representing each book object (id, title, author, year)
![image](https://github.com/user-attachments/assets/0ff17069-7f08-41b6-b659-cf210b5a32f9)
![image](https://github.com/user-attachments/assets/846b5307-19ef-4aa5-911a-071a39c08929)
---
### File Paths and Constants
- `books.csv` – The path to the CSV file that stores all book data persistently between sessions
  ---
### Error Handling
Implemented using `try-catch` blocks:

- For file operations (`IOException`)
- For numeric input conversion (`NumberFormatException`)
- For general validation and error prevention (e.g., ID not found, year format)
 ![image](https://github.com/user-attachments/assets/6258c169-4327-4969-8768-5d2acc28a2bf)

---

### Switch Statements
Used in menu navigation:
- `Main.java` – Handles the main menu loop
- `Menu.java` – Displays menu options and processes user input

Each case corresponds to a specific operation (e.g., add book, delete book, view books)

---

**Importing Books from CSV:**
![image](https://github.com/user-attachments/assets/9cdcae10-e375-4ea8-8d06-342252956af5)
**Exporting Books to CSV:**
![image](https://github.com/user-attachments/assets/5b1f819d-e5cb-466c-a0c5-aa335c2553fa)
All book details are written line by line in CSV format using `BufferedWriter`, which ensures efficient writing and automatic resource management through the try-with-resources block.
