import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
       
        int numberHistoricalFigures = scan.nextInt();
        String[][] database = new String[numberHistoricalFigures][3];
        scan.nextLine(); 
        
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                System.out.println("\n\tFigure " + (i+1)); 
                System.out.print("\t - Name: ");
                database[i][0] = scan.nextLine();

                System.out.print("\t - Date of birth: ");
                database[i][1] = scan.nextLine();

                System.out.print("\t - Occupation: ");
                database[i][2] = scan.nextLine();

                System.out.print("\n");

            }
        }
         
      
        System.out.println("These are the values you stored:"); 
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String search = scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            if (search.equals(database[i][0])) {
                System.out.print("\tName: " + database[i][0]);
                System.out.print("\tDate of birth: " + database[i][1]);
                System.out.print("\tOccupation: " + database[i][2]);
                break;
            }  
        }  
        

        scan.close();
    }


    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
