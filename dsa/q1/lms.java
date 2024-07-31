import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static class Book {
        private int bookId;
        private String title;
        private String author;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        public int getBookId() {
            return bookId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
        }
    }

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
            new Book(1, "To Kill a Mockingbird", "Harper Lee"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(4, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(5, "Moby Dick", "Herman Melville")
        };

        // Sort books by title for binary search
        Book[] sortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle));

  System.out.println("Library Management System");

        while (true) {
          
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to search: ");
                    String titleLinear = scanner.nextLine();
                    Book resultLinear = linearSearch(books, titleLinear);
                    if (resultLinear != null) {
                        System.out.println("Book found: " + resultLinear);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the title of the book to search: ");
                    String titleBinary = scanner.nextLine();
                    Book resultBinary = binarySearch(sortedBooks, titleBinary);
                    if (resultBinary != null) {
                        System.out.println("Book found: " + resultBinary);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
