# 📚 BLM25 - Library Book Manager

### 👩‍💻 Created by: Sogdiana Arasheva
**University:** Ala-Too International University  
**Course:** Java Programming – 2nd Semester Final Project

---

## 📝 Overview

**BLM25** (Library Book Manager) is a command-line Java application designed to help users manage a collection of books. It allows the user to add, view, update, delete, import, export, and generate reports in an organized and efficient way.

The application demonstrates core programming concepts such as object-oriented design, modularization, file handling, and input validation using Java and Maven.

---

## 🎯 Project Objectives

- Build a fully functional book management system using Java.
- Implement object-oriented principles with clean modular structure.
- Handle persistent data storage using CSV files.
- Validate and sanitize all user inputs.
- Provide features for book import/export in CSV format.
- Automatically generate a report of all books.
- Deliver a complete and professional command-line program with minimal inline comments.

---

## ✅ Project Requirements

1. Define a `Book` class with ID, title, author, year, and genre.
2. Add new books through a CLI input form.
3. Display all books in a formatted list.
4. Update book information by ID.
5. Delete a book by ID.
6. Save book data persistently in a file (`books.csv`).
7. Allow importing and exporting of book data in CSV format.
8. Generate a formatted report file (`report.txt`).
9. Ensure proper input validation for each field.
10. Use a modular and package-based project structure.

---

## 📂 Project Structure


---

## 📘 How It Works

On launch, users interact with a text-based menu that includes the following options:


Users enter a number to choose an operation, and the system performs the task based on the input.

---

## 🛠 Technologies Used

- Java 17+
- IntelliJ IDEA
- Maven (for build and dependency management)

---

## 📄 Documentation

### 🔹 Classes and Responsibilities

- **Book.java** – The model class representing a book.
- **LibraryService.java** – Handles core business logic: add, view, update, delete.
- **FileHandler.java** – Manages reading and writing of CSV files and reports.
- **Menu.java** – CLI interface for user interaction and menu navigation.
- **Main.java** – Entry point of the application.

### 🔹 Data Structures

- `ArrayList<Book>` – Used to store the book list in memory.

### 🔹 Input Validation

- Checks for empty inputs.
- Ensures year is a valid integer.
- Prevents duplicate IDs when importing.

### 🔹 Challenges Encountered

- Managing file read/write operations safely.
- Keeping the application modular and readable.
- Implementing consistent input handling for CLI interaction.

---

## 🧪 Test Cases and Expected Output

### ➕ Add Book
**Action:** Chose option `1` to add a book.  
**Input:**
**Expected Output:**  
✅ Book added successfully.

---

### ❌ Delete Book
**Action:** Chose option `4` to delete a book.  
**Input:**
**Expected Output:**  
✅ Book deleted successfully.

---

### 📖 View All Books
**Action:** Chose option `2` to view all books.  
**Expected Output:**

---

### 🖊️ Update Book
**Action:** Chose option `3` to update a book.  
**Input:**
**Expected Output:**  
✅ Book updated successfully.

---

### 🔚 Exit Application
**Action:** User chose to exit the program.  
**Expected Output:**  
Program exited with `Process finished with exit code 130`.

---

## 🗃 Files Used

- **`books.csv`** – Stores all book data persistently.
- **`report.txt`** – Contains the generated report of all books.
- **`.java` files** – Core logic and features of the application organized in the `blm25` package.

---

## ✅ Final Remarks

This project satisfies all academic and technical requirements:

- ✅ Full CRUD functionality
- ✅ File handling with CSV import/export
- ✅ Clean and modular structure
- ✅ Proper user input validation
- ✅ All tasks performed successfully and reflected in outputs

Thank you for reviewing this project!  
Created by **Sogdiana Arasheva** – BLM25 Library Book Manager 📖✨
