#  BLM25 - Library Book Manager

**Project Presentation Link**: [Here]

### Created by: Sogdiana Arasheva
**University:** Ala-Too International University  
**Course:** Java Programming – Final Coursework Project

---
##  Project Description

**BLM25** is a Library Book Manager system built for managing a library's collection of books. The primary goal of the project is to provide an easy-to-use, command-line interface (CLI) application for handling books in the library. It allows users to add, view, update, and delete books, all while ensuring that the data is stored persistently in a CSV file. The application is modular, well-structured, and user-friendly, with a focus on error handling, input validation, and reporting.

The key functionality of the Library Book Manager includes:
- Managing books through CRUD operations.
- Data persistence using CSV files.
- Report generation summarizing the library’s collection.

---

##  Project Objectives

The objectives of this project are:
1. To design and implement a functional library book manager in Java.
2. To implement CRUD operations (Create, Read, Update, Delete) for book management.
3. To ensure data persistence through CSV file handling.
4. To create a modular code structure for easier maintenance and scalability.
5. To validate user input and ensure correct data is entered for each operation.
6. To handle exceptions and errors effectively within the application.
7. To allow the user to generate reports summarizing the books in the library.
8. To implement a command-line interface that is both efficient and user-friendly.
9. To practice using Java’s object-oriented features such as classes, objects, and methods.
10. To provide a clean, readable output to the user for various actions like book addition, update, deletion, and viewing.

---

## Project Requirement List

The following requirements were implemented to achieve the objectives:

1. **CRUD Operations**:
    - **Create**: Add a new book to the library with details (ID, Title, Author, Year).
    - **Read**: View all books in the library.
    - **Update**: Modify details of an existing book by its ID.
    - **Delete**: Remove a book from the library by its ID.

2. **Data Persistence**:
    - Implement functionality to read and write book data from/to a CSV file.
    - Ensure that data is saved and retrieved accurately, even if the program is restarted.

3. **Error Handling**:
    - Validate user inputs to prevent invalid data entry (e.g., non-numeric year or empty title).
    - Provide appropriate error messages for incorrect inputs or failed operations.

4. **Report Generation**:
    - Generate a report (`report.txt`) listing all books in a readable format.
    - Provide users with a summary of the books currently in the library.

5. **Modular Design**:
    - Use object-oriented programming principles to separate concerns (e.g., separating book handling, file operations, and the user interface).
    - Use multiple classes to organize code: `Book`, `LibraryService`, `FileHandler`, `Menu`, `Main`.

6. **CLI Interface**:
    - Design a user-friendly menu with options for all available operations (add, view, update, delete books).
    - Provide clear instructions and feedback for users interacting with the program.

7. **Input Validation**:
    - Ensure only valid data is accepted (e.g., numeric values for years, non-empty titles, etc.).
    - Handle invalid or unexpected user inputs gracefully with error messages.

8. **Sorting and Filtering**:
    - Optionally allow books to be sorted by title, author, or year for easier viewing.

9. **Efficient Data Handling**:
    - Manage the in-memory list of books efficiently and ensure smooth file reading and writing operations.

10. **File Handling**:
    - Properly read and write to `books.csv`, ensuring data persists across different runs of the application.

---

##  Documentation

### Classes and Responsibilities:

1. **Book.java**  
   Represents a book with attributes: ID, Title, Author, and Year. This class includes getter and setter methods for each attribute.

2. **LibraryService.java**  
   Handles business logic such as adding, updating, and deleting books. It also provides methods for reading and writing book data to/from a CSV file.

3. **FileHandler.java**  
   Manages file I/O operations, specifically reading from and writing to the `books.csv` file. Ensures that data is persistent across program runs.

4. **Menu.java**  
   Displays the main menu of options to the user and handles their input. Provides a user interface for interacting with the library system.

5. **Main.java**  
   The main entry point of the application. Initializes and starts the program, calling the menu interface and managing the overall flow.

### Data Structures:

- **ArrayList<Book>**: Used to store the collection of books in memory. This allows dynamic resizing and easy access to the books.
- **CSV File**: Used to persist the list of books. The CSV file is read at the beginning of the program and updated each time changes are made.

### Algorithms:

- **CRUD Algorithms**: Standard Create, Read, Update, and Delete algorithms were implemented. Each operation interacts with both the in-memory data structure (ArrayList) and the CSV file.
- **CSV File Parsing**: Simple string manipulation is used to read and write CSV files, where each line represents a book.

### Challenges:

- **Input Validation**: Ensuring that user input was correctly validated (e.g., non-empty strings for title and author, numeric year, etc.).
- **Data Persistence**: Properly handling the reading/writing of CSV files to persist data across different program runs.
- **User Interface Design**: Designing an intuitive CLI that could handle user commands and feedback while remaining simple.

---

##  Test Cases and Expected Output

###  Add Book
**Action:** Chose option `1` to add a book.  
**Input:**
**Expected Output:**  
✅ Book added successfully.

---

###  Delete Book
**Action:** Chose option `4` to delete a book.  
**Input:**
**Expected Output:**  
✅ Book deleted successfully.

---

### View All Books
**Action:** Chose option `2` to view all books.  
**Expected Output:**

---

###  Update Book
**Action:** Chose option `3` to update a book.  
**Input:**
**Expected Output:**  
✅ Book updated successfully.

---

###  Exit Application
**Action:** User chose to exit the program.  
**Expected Output:**  
Program exited with `Process finished with exit code 130`.

---

## Code

The full implementation is in Java, with each class organized into the `blm25` package. The code adheres to object-oriented principles, is modular, and follows clean code practices to ensure readability and maintainability. The application correctly implements all required features and handles user interactions efficiently.

---

![image](https://github.com/user-attachments/assets/c3e92ae3-5089-496b-8c81-36224e78c6b1)


##  Files Used

- **`books.csv`**: This file is used to store the library’s books data in CSV format. Each book's details (ID, title, author, and year) are saved in this file for persistence.
- **`report.txt`**: This file is generated when the user requests a report of all books. It contains a readable summary of the books in the library.
- **`Main.java`**: Contains the main method that runs the application.
- **`LibraryService.java`**: Contains the logic for managing the books.
- **`FileHandler.java`**: Responsible for saving and loading book data from the CSV file.

---

Thank you for reviewing this project!  
 **Sogdiana Arasheva** – BLM25 Library Book Manager 

