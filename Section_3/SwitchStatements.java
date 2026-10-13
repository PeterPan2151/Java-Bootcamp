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
        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("Congratulations, you are eliglbe for the credit card");
        } else {
            System.out.println("Sorry, you are not elegible for the credit card");
        }

        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Slow Down");
                break;
            case "red":
                System.out.println("STOP");
                break;
        }

        int grade = 85;
        if (grade >= 80) {
            System.out.println("You got an A!");
        } else if (grade >= 70) {
            System.out.println("You got a B!");
        } else if (grade >= 60) {
            System.out.println("You got a C.");
        } else if (grade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }

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
