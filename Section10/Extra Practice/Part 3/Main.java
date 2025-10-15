import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = promptForTitle(scan);
        String publisher = promptForPublisher(scan);
        int issueNumber = promptForIssueNumber(scan);
        int publicationYear = promptForPublicationYear(scan);

        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);

        System.out.println("Magazine added to the library: " + newMagazine.getTitle());
        scan.close();

    }

    public static boolean isNullOrBlank(String input) {
        return input == null || input.isBlank();
    }

    public static boolean incorrectIssueNumber(int input) {
        return input <= 0;
    }

    public static boolean incorrectPublicationYear(int input) {
        return input <= 0;
    }

    public static String promptForTitle(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid title: ");
            String title = scan.nextLine();
            if (!isNullOrBlank(title)) {
                return title;
            }
        }
    }

    public static String promptForPublisher(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scan.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    public static int promptForIssueNumber(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int issueNumber = scan.nextInt();

            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }
        }
    }

    public static int promptForPublicationYear(Scanner scan) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int publicationYear = scan.nextInt();

            if (!incorrectIssueNumber(publicationYear)) {
                return publicationYear;
            }
        }
    }
}