I am Ritesh Raj Tiwari
# Digital Library Book Management System Assignment For 	
Software Engineer Intern (JAVA)
Ajackus ·

## Project Overview
A comprehensive Spring Boot application for managing a digital library's book catalog, enabling librarians to efficiently add, update, search, and remove books while maintaining their availability status.

## 🌟 Key Features
- Add new books with unique identifiers
- View complete book catalog
- Search books by ID or title
- Update book details
- Delete book records
- CLI and REST API interfaces
- In-memory H2 database
- Comprehensive validation

## 🚀 Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok
- JUnit & Mockito



## 🔧 Installation and Setup

### Local Setup
```bash
# Clone the repository
git clone https://github.com/ritesh7092/ajackus.git
cd Ajackus

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

## 💻 Usage

### REST API Endpoints
- `POST /api/books`: Add a new book
- `GET /api/books`: View all books
- `GET /api/books/id/{bookId}`: Search book by ID
- `GET /api/books/title/{title}`: Search book by title
- `PUT /api/books/{bookId}`: Update book details
- `DELETE /api/books/{bookId}`: Delete a book

### CLI Interface
1. Run the application
2. Choose from menu options:
   - Add a Book
   - View All Books
   - Search Book
   - Update Book
   - Delete Book
   - Exit System

## 💾 Database
- In-memory H2 database
- Console available at: `http://localhost:8080/h2-console`
  - JDBC URL: `jdbc:h2:mem:riteshdb`
  - Username: `root`
  - Password: `pass12345`
 
API Documentation Summary
Base URL: /api/books

Endpoints:

POST /api/books
Description: Adds a new book.
Request Body: Validated Book JSON object.
Response: Created Book with status 201.

GET /api/books
Description: Retrieves all books.
Response: List of books with status 200.

GET /api/books/id/{bookId}
Description: Retrieves a book by its ID.
Response: Book if found; otherwise, 404.

GET /api/books/title/{title}
Description: Retrieves a book by its title.
Response: Book if found; otherwise, 404.

PUT /api/books/{bookId}
Description: Updates an existing book by its ID.
Request Body: Validated updated Book JSON object.
Response: Updated Book with status 200.

DELETE /api/books/{bookId}
Description: Deletes a book by its ID.
Response: HTTP status 204 on successful deletion.


## 🔒 Constraints
- Unique Book ID
- Non-empty Title and Author
- Availability Status: "Available" or "Checked Out"



# My Learning Journey: Building a Library Management System

## Challenges I Faced

1. **Data Validation**
   - Implementing proper validation was more complex
   - Ensuring book IDs are unique and titles/authors aren't empty required careful coding
   - Learning to handle different validation scenarios was a learning curve

2. **Choosing the Right Technology**
   - Deciding between different approaches (CLI vs. REST API)
   - Understanding how Spring Boot works

3. **Error Handling**
   - Handling different types of exceptions
   - Making sure the application doesn't crash on invalid inputs

## What I Learned

1. **Coding Best Practices**
   - The importance of writing clean, modular code
   - How to structure a Spring Boot project
   - The value of separating concerns (model, service, controller)

2. **Problem-Solving Skills**
   - Breaking down complex requirements into smaller, manageable tasks
   - Thinking through different use cases and potential errors

## Improvements I Would Make with More Time

1. **Enhanced Features**
   - Add user authentication and authorization
   - Add more detailed reporting features

2. **Better User Experience**
   - Create a friendly web interface
   - Add more detailed error messages
   - Implement more comprehensive logging
   - Create a more intuitive search function

3. **Advanced Validations**
   - More robust input validation
   - Add more detailed checks for book details
   - Implement more complex business rules


4. **Testing**
   - Write more comprehensive unit and integration tests
   - Add end-to-end testing scenarios
   - Create mock data for thorough testing



## 📞 Contact
RITESH RAJ TIWARI
IIIT BHAGALPUR, INDIA
