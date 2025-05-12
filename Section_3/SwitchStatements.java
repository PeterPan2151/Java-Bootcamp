public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("You can wear a shirt");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat");
                break;
            case "cloudy":
                System.out.println("You should wear a sweater");
                break;
            case "snowy":
                System.out.println("You should wear a jacket");
                break;
        
            default:
                System.out.println("You can wear what you want");
                break;
        }
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch (role) {
            case 1:
                System.out.println("You are an admin");
                break;
            
            case 2: 
                System.out.println("You are an editor");
                break;
            case 3:
                System.out.println("You are a user");
                break;
        
            default:
                System.out.println("PLease contact HR");
                break;
        }

        int temperature = 75;
        int humidity = 65;
        
        if (temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid");
        } else if(temperature >= 80) {
            System.out.println("It's too hot");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid");
        } else if (temperature <= 60) {
            System.out.println("It's too cold");
        } else {
            System.out.println("It's confortable");
        }

     
        int age = 25;
        int income = 50000;
        
        if (age >= 18 && age <= 60 && income <= 30000){
            System.out.println("Your eligible");
        } else {
            System.out.println("You are not eligible");
        }

        String lightColor = "green";

        switch (lightColor) {
            case "green":
                System.out.println("Go"); 
                break;
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("slow down");
                break;
        
            default:
                break;
        }

        
        int grade = 85;
    
        if (grade >= 90) {
            System.out.println("You got an A");
        } else if (grade >= 80) {
            System.out.println("You got a B");
        } else if (grade >= 70) {
            System.out.println("You got a C");
        } else if (grade >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got a F");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        switch (browser) {
            case "Chrome":
                System.out.println("Enjoy your chrome extensions");
                break;
            case "Firefox":
                System.out.println("The best non profit browser");
                break;
            case "Safari":
                System.out.println("Apple user");
            default:
                System.out.println("Weird browser");
                break;
        }
        
        

    }
}
