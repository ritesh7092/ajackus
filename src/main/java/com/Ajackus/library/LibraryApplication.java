package com.Ajackus.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
}

//Uncomment Below Code commenting Above code to enable also Command Line 




//package com.Ajackus.library;
//
//import com.Ajackus.library.model.Book;
//import com.Ajackus.library.service.BooksService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.List;
//import java.util.Scanner;
//
//@SpringBootApplication
//public class LibraryApplication implements CommandLineRunner {
//	@Autowired
//	private BooksService booksService;
//
//	public static void main(String[] args) {
//		SpringApplication.run(LibraryApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) {
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			displayMenu();
//			int choice = getUserChoice(scanner);
//			switch (choice) {
//				case 1:
//					addBook(scanner);
//					break;
//				case 2:
//					viewAllBooks();
//					break;
//				case 3:
//					searchBook(scanner);
//					break;
//				case 4:
//					updateBook(scanner);
//					break;
//				case 5:
//					deleteBook(scanner);
//					break;
//				case 6:
//					System.out.println("Exiting the system. Goodbye!");
//					return;
//				default:
//					System.out.println("Invalid choice. Please try again.");
//			}
//		}
//	}
//
//	private void displayMenu() {
//		System.out.println("\n--- Digital Library Book Management System By Ritesh Raj Tiwari---");
//		System.out.println("1. Add a Book");
//		System.out.println("2. View All Books");
//		System.out.println("3. Search Book");
//		System.out.println("4. Update Book");
//		System.out.println("5. Delete Book");
//		System.out.println("6. Exit System");
//		System.out.print("Enter your choice: ");
//	}
//
//	private int getUserChoice(Scanner scanner) {
//		try {
//			return Integer.parseInt(scanner.nextLine());
//		} catch (NumberFormatException e) {
//			return -1;
//		}
//	}
//
//	private void addBook(Scanner scanner) {
//		try {
//			System.out.print("Enter Book ID: ");
//			String bookId = scanner.nextLine();
//
//			System.out.print("Enter Title: ");
//			String title = scanner.nextLine();
//
//			System.out.print("Enter Author: ");
//			String author = scanner.nextLine();
//
//			System.out.print("Enter Genre: ");
//			String genre = scanner.nextLine();
//
//			System.out.print("Enter Availability Status (Available/Checked Out): ");
//			String status = scanner.nextLine();
//
//			Book book = new Book(bookId, title, author, genre, status);
//			booksService.addBook(book);
//			System.out.println("Book added successfully!");
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//	}
//
//	private void viewAllBooks() {
//		List<Book> books = booksService.findAllBooks();
//		if (books.isEmpty()) {
//			System.out.println("No books in the library.");
//			return;
//		}
//
//		System.out.println("\n--- Book List ---");
//		for (Book book : books) {
//			System.out.printf("ID: %s, Title: %s, Author: %s, Genre: %s, Status: %s%n",
//					book.getBookId(),
//					book.getTitle(),
//					book.getAuthor(),
//					book.getGenre(),
//					book.getAvailabilityStatus()
//			);
//		}
//	}
//
//	private void searchBook(Scanner scanner) {
//		System.out.println("Search by:");
//		System.out.println("1. Book ID");
//		System.out.println("2. Title");
//		System.out.print("Enter your choice: ");
//		int searchChoice = getUserChoice(scanner);
//		try {
//			switch (searchChoice) {
//				case 1:
//					System.out.print("Enter Book ID: ");
//					String bookId = scanner.nextLine();
//					booksService.findBookById(bookId)
//							.ifPresentOrElse(
//									book -> System.out.println("Book found: " + book),
//									() -> System.out.println("Book not found")
//							);
//					break;
//				case 2:
//					System.out.print("Enter Title: ");
//					String title = scanner.nextLine();
//					booksService.findBookByTitle(title)
//							.ifPresentOrElse(
//									book -> System.out.println("Book found: " + book),
//									() -> System.out.println("Book not found!")
//							);
//					break;
//				default:
//					System.out.println("Invalid search option!");
//			}
//		} catch (Exception e) {
//			System.out.println("Error searching book: " + e.getMessage());
//		}
//	}
//
//	private void updateBook(Scanner scanner) {
//		try {
//			System.out.print("Enter Book ID to update: ");
//			String bookId = scanner.nextLine();
//			Book existingBook = booksService.findBookById(bookId)
//					.orElseThrow(() -> new IllegalArgumentException("Book not found"));
//			System.out.println("Current Book Details: " + existingBook);
//
//			System.out.print("Enter new Title (press enter to keep current): ");
//			String title = scanner.nextLine();
//			if (!title.isEmpty()) {
//				existingBook.setTitle(title);
//			}
//			System.out.print("Enter new Author (press enter to keep current): ");
//			String author = scanner.nextLine();
//			if (!author.isEmpty()) {
//				existingBook.setAuthor(author);
//			}
//			System.out.print("Enter new Genre (press enter to keep current): ");
//			String genre = scanner.nextLine();
//			if (!genre.isEmpty()) {
//				existingBook.setGenre(genre);
//			}
//			System.out.print("Enter new Availability Status (press enter to keep current): ");
//			String status = scanner.nextLine();
//			if (!status.isEmpty()) {
//				existingBook.setAvailabilityStatus(status);
//			}
//			booksService.updateBook(bookId, existingBook);
//			System.out.println("Book updated successfully!");
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//	}
//
//	private void deleteBook(Scanner scanner) {
//		try {
//			System.out.print("Enter Book ID to be delete: ");
//			String bookId = scanner.nextLine();
//			booksService.deleteBook(bookId);
//			System.out.println("Book deleted successfully!");
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//	}
//}
//
//
//
//
//
//
//
//
//

