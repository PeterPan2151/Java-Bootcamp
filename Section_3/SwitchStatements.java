public class SwitchStatements {
    public static void main(String[] args) {
        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("Wear a shirt");
                break;
            case "cloudy":
                System.out.println("Wear a sweather");
                break;
            case "rainy":
                System.out.println("Wear a raincoat");
                break;
            case "snowy":
                System.out.println("Wear a jacket");
                break;
            default:
                System.out.println("You're good");
                break;
        }

        int role = 2;
        switch (role) {
            case 1:
                System.out.println("CEO");
                break;
            case 2:
                System.out.println("Admin");
                break;
            case 3:
                System.out.println("Manager");
                break;
            default:
                System.out.println("Employee");
                break;
        }

        int temperature = 75;
        int humidity = 65;
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("Its to hot and humid");
        } else if (temperature >= 80) {
            System.out.println("Its to hot");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("its to cold and humid");
        } else if (temperature <= 60) {
            System.out.println("Its too cold");
        } else {
            System.out.println("Its okay");
        }

        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green,
        // yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Nice");
                break;
            case "Firefox":
                System.out.println("Cool browser");
                break;
            case "Safari":
                System.out.println("You must use an apple product");
                break;
            case "Edge":
                System.out.println("Old browser");
                break;
            default:
                System.out.println("What browser do you use?");
                break;
        }
    }
}
