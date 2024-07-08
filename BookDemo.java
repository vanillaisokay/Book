// Import statement
import java.util.Scanner;

public class BookDemo {
    // Create main method
    public static void main (String[] args) {
        // Create objects Scanner & Book
        Scanner keyboard = new Scanner(System.in);
        Book myFavoriteBook = new Book();
        int option;

        do {
            // Print options for user
            System.out.println("Press 1 to change the name of the book");
            System.out.println("Press 2 to change the number of pages in the book");
            System.out.println("Press 3 to change the current page");
            System.out.println("Press 4 to view all information about the book");
            System.out.println("Press 5 to end the program");
            // Accept user's selection
            option = keyboard.nextInt();
            keyboard.nextLine();
            // Option to change name
            if (option == 1) {
                System.out.println("What is the name of the book?");
                String newName = keyboard.nextLine();
                myFavoriteBook.setName(newName);
            } // Option to change number of pages
            else if (option == 2) {
                System.out.println("How many pages are in the book?");
                int newNumberOfPages = keyboard.nextInt();
                myFavoriteBook.setNumberOfPages(newNumberOfPages);
            } // Option to change current page
            else if (option == 3) {
                System.out.println("What is the page you are currently on in the book?");
                int newCurrentPage = keyboard.nextInt();
                myFavoriteBook.setCurrentPage(newCurrentPage);
            } // Option to display all book information
            else if (option == 4) {
                System.out.println("Name: " + myFavoriteBook.getName());
                System.out.println("Number of pages: " + myFavoriteBook.getNumberOfPages());
                System.out.println("Current page: " + myFavoriteBook.getCurrentPage());
            } // Option to end program
            else if (option == 5) {
                System.out.println("Goodbye.");
            } // Display error if options 1-5 aren't chosen
            else {
                System.out.println("Error!");
            }
        // Loop program if option 5 isn't chosen  
        } while (option != 5);
    }
}
