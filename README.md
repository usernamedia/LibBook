# 📚 BLM25 – Library Book Manager

> Author: **Sogdiana Arasheva**  
> Group: **COMCEH24**

---

## 📝 Description

The aim of this project is to implement CRUD (Create, Read, Update, Delete) operations using the Java programming language with a Command Line Interface (CLI). This simple console-based application allows users to manage a virtual library of books, perform operations like adding, viewing, updating, deleting records, and storing them in a persistent file. The project enhances skills in modular design, file handling, error control, and user interaction in a beginner-friendly way.

---

## 🎯 Objectives

- Develop a practical understanding of object-oriented programming in Java.
- Learn to use modular programming and best coding practices.
- Gain experience with file input/output for data persistence.
- Understand how to validate input and handle user errors gracefully.
- Learn to design user-friendly command-line interfaces.
- Implement import/export functionality using CSV format.
- Provide a real-world style data manager with clear functionality.
- Improve code readability and organization through packages and services.
- Generate basic summary reports or activity stats.
- Prepare for more advanced future topics such as JSON, tests, or GUI.

---

## ✅ Project Requirement List

1. Implement full **CRUD operations** (Create, Read, Update, Delete).
2. Use a **Command Line Interface (CLI)** for interaction.
3. Ensure **input validation** (e.g., empty inputs, invalid numbers).
4. Implement **error handling** for smooth runtime performance.
5. Store and load data using a **CSV file** for **data persistence**.
6. Organize code into a **modular structure** with separate classes.
7. Allow **CSV data import and export**.
8. Use a **service layer** to manage logic cleanly (e.g., `LibraryService`).
9. Create a **menu class** to manage CLI interaction.
10. Follow clean **code conventions** and organize with the `blm25` package.

---

## 📂 Files Used

- `books.csv`: Stores book records with fields `id`, `title`, `author`, `year`.
- Located in: `src/main/resources/books.csv`
- Format:
  ```
  1,The Great Gatsby,F. Scott Fitzgerald,1925
  2,To Kill a Mockingbird,Harper Lee,1960
  ```

---

## 🧠 Documentation

### 📦 Structure & Packages

```
BLM25/
├── src/
│   └── main/
│       └── java/
│           └── blm25/
│               ├── Book.java
│               ├── FileHandler.java
│               ├── LibraryService.java
│               ├── Menu.java
│               └── Main.java
│       └── resources/
│           └── books.csv
├── README.md
└── pom.xml
```

### 🧩 Main Classes and Their Responsibilities

- **Book.java** – Data class representing a book record.
- **FileHandler.java** – Handles reading from and writing to CSV files.
- **LibraryService.java** – Contains the logic for managing the book list (add, edit, delete, search).
- **Menu.java** – Displays the CLI and handles user inputs.
- **Main.java** – Program entry point, integrates everything.

### 🔁 Algorithms & Data Handling

- Uses a `List<Book>` to store books in memory.
- Reads from `books.csv` on start and saves on exit.
- Uses loops, conditionals, and string parsing for command line control.

---

## 🧪 Test Cases and Outputs

### ➕ Add Book

**Input:**
```
1. Add Book  
Enter Title: Clean Code  
Enter Author: Robert C. Martin  
Enter Year: 2008
```

**Expected Output:**
```
✅ Book added successfully!
```

### 🧾 List All Books

**Input:**
```
2. View All Books
```

**Expected Output:**
```
📚 List of Books:
ID: 1 | Title: Clean Code | Author: Robert C. Martin | Year: 2008
```

### ✏️ Update Book

**Input:**
```
3. Update Book  
Enter Book ID: 1  
New Title: Clean Architecture  
New Author: Robert C. Martin  
New Year: 2017
```

**Expected Output:**
```
✅ Book updated successfully!
```

### ❌ Delete Book

**Input:**
```
4. Delete Book  
Enter Book ID: 1
```

**Expected Output:**
```
✅ Book deleted successfully!
```

---

## 📸 Screenshots

You can add screenshots in a folder like `/screenshots` and link them here using:

```
![Menu Screenshot](screenshots/menu.png)
```

---

## 🔚 Conclusion

The BLM25 project successfully demonstrates how to build a structured and fully-functional console-based library manager using Java. All key features have been implemented, from CRUD and data persistence to error handling and clean CLI interaction. The project serves as a strong foundation for beginner Java developers and can be extended further with JSON, test cases, GUI, or reporting.

---

## 💡 Possible Future Improvements

- Add JSON data export/import.
- Integrate JUnit test cases.
- Add GUI using JavaFX or Swing.
- Generate formatted PDF/HTML reports.
- Include usage statistics or charts for book data.