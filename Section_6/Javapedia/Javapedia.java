import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int quanFigures = scan.nextInt();

        String[][] figures = new String[quanFigures][3];
        scan.nextLine();
        
        for (int i = 0; i < figures.length; i++) {
            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
            String name = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            String dob = scan.nextLine();

            System.out.print("\t - Occupation: ");
            String occupation = scan.nextLine();

            figures[i][0] = name;
            figures[i][1] = dob;
            figures[i][2] = occupation;

            System.out.print("\n");
        }
        
        System.out.println("These are the values you stored:"); 
        print2DArray(figures);

        System.out.print("\nWho do you want information on? ");  
        String findName = scan.nextLine();
    
        for (int i = 0; i < figures.length; i++) {
            if (figures[i][0].equals(findName)) {
                System.out.println("\tName: " + figures[i][0]);
                System.out.println("\tName: " + figures[i][1]);
                System.out.println("\tName: " + figures[i][2]);
            }
        }
        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t" + array[i][0] + " " + array[i][1] + " " + array[i][2] + " ");
        }
    }

}
