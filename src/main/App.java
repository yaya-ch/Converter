import java.util.Scanner;

public class App {

    private static final double FIVE = 5;
    private static final double NINE = 9;
    private static final double THIRTY_TWO = 32;
    private static double fahrenheit;
    private static double celsius;
    private static int userInput;
    private static char answer;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * starts the application
     * @param args
     */
    public static void main (String[] args) {
        System.out.println("Celsius and Fahrenheit converter");
        System.out.println("======================");
        launchApp();
    }

    /**
     * asks user to choose the right mode
     * 1: convert from celsius to fahrenheit
     * 2: convert from fahrenheit to celsius
     */
    public static void usersInput(){
        userInput = scanner.nextInt();
        while (userInput != 1 && userInput != 2) {
            System.out.println("incorrect value. enter 1 or 2");
            userInput = scanner.nextInt();
        }
    }

    /**
     * convert celsius to fahrenheit
     */
    public static void celsiusToFahrenheit() {
        System.out.println("enter degrees in celsius");
        celsius = scanner.nextDouble();
        scanner.nextLine();
        fahrenheit = (NINE / FIVE) * celsius + THIRTY_TWO;
        System.out.println("degrees in fahrenheit " + fahrenheit + " f");
    }

    /**
     * convert fahrenheit to celsius
     */
    public static void fahrenheitToCelsius() {
        System.out.println("enter degrees in fahrenheit");
        fahrenheit = scanner.nextDouble();
        scanner.nextLine();
        celsius = ((fahrenheit - THIRTY_TWO) * FIVE) / NINE;
        System.out.println("degrees in celsius: "+ celsius + " c");
    }

    /**
     * asks the user to continue or exit the app
     */
    public static void continueApp(){
        System.out.println("do you want to continue? press 'y' to continue or 'n' to exit");
        answer = scanner.nextLine().charAt(0);
        while (answer != 'y' && answer != 'n'){
            System.out.println("incorrect input. please type 'y' to continue or 'n' to exit the app");
            answer = scanner.nextLine().charAt(0);
        }
    }

    /**
     * starts the different actions
     */
    public static void launchApp(){
        do {
            System.out.println("choose your option:\n 1- Celsius to Fahrenheit.\n 2- Fahrenheit to Celsius.");
            usersInput();
            if (userInput == 1) {
                celsiusToFahrenheit();
            } else {
                fahrenheitToCelsius();
            }
            continueApp();
        } while (answer == 'y');

        System.out.println("thank you for using our converter. see you soon");
    }

}
