
package programmingexercise2;

/**
 *
 * @author Justin F
 */
import java.util.Scanner;

public class Programmingexercise2{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        print(" === Converting Temperature ===\n");
        convertTemperature();
    }

    private static void convertTemperature() {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        print("\nEnter 1 for Fahrenheit to Celsius"
                + "\nEnter 2 for Celsius to Fahrenheit"
                + "\nSomething else to Exit." + "\nYour Option:");
        int selection = input.nextInt();
        if (selection == 1) {
            print("Enter a degree in Fahrenheit:");
            far2cel();
        } else if (selection == 2) {
            print("Enter a degree in Celsius:");
            cel2far();
        } else {
            print("Bye..");
        }
    }

    private static void cel2far() {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        print(celsius + " celsius is " + ((celsius * 9 / 5.0) + 32)
                + " Fahrenheit");
        convertTemperature();
    }

    private static void far2cel() {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        Double Fahrenheit = input.nextDouble();
        print(Fahrenheit + " Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0))
                + " celsius");
        convertTemperature();
    }

    private static void print(String string) {
        // TODO Auto-generated method stub
        System.out.print("\n" + string);
    }
}