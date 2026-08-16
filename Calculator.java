import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taschenrechner");

        System.out.print("Erste Zahl: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Zweite Zahl: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis;

        switch (operator) {

            case '+':
                ergebnis = zahl1 + zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;

            case '-':
                ergebnis = zahl1 - zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;

            case '*':
                ergebnis = zahl1 * zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;

            case '/':
                ergebnis = zahl1 / zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;

            default:
                System.out.println("Ungültiger Operator!");
        }

        scanner.close();
    }
 }
   