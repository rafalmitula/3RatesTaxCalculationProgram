package pl.rafalmitula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static boolean shouldContinue = true;
    private static Scanner scn = new Scanner(System.in);
    private static Methods methods = new Methods();

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witamy w programie do rozliczania VATu.");
        System.out.println();


        while (shouldContinue) {

            System.out.println("--------------");
            System.out.println("Wybierz opcję:");
            System.out.println("1. Rozlicz VAT - kwota brutto");
            System.out.println("2. Rozlicz VAT - kwota netto");
            System.out.println("3. Wyjdź");
            System.out.println("--------------");

            try {

                int userChoice = scn.nextInt();
                switch (userChoice) {

                    case 1 -> {

                        boolean shouldContinueGross = true;

                        while (shouldContinueGross) {
                            System.out.println();
                            System.out.println("Wybierz opcję od 1 do 4:\n1. 23%\n2. 8%\n3. 5%\n4. Powrót");

                            try {

                                int userChoiceGross = scn.nextInt();

                                switch (userChoiceGross) {

                                    case 1 -> methods.calculateGross23();
                                    case 2 -> methods.calculateGross8();
                                    case 3 -> methods.calculateGross5();
                                    case 4 -> shouldContinueGross = false;
                                    default -> {
                                        System.out.println("Błąd wprowadzania!\nSpróbuj ponownie.");
                                        {

                                        }
                                    }
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz.");
                                scn.next();

                            }

                        }

                    }

                    case 2 -> {

                        boolean shouldContinueNet = true;

                        while (shouldContinueNet) {
                            System.out.println();
                            System.out.println("Wybierz stawke VAT:\n1. 23%\n2. 8%\n3. 5%\n4. Powrót");

                            try {

                                int userChoiceNet = scn.nextInt();

                                switch (userChoiceNet) {
                                    case 1 -> methods.calculateNet23();
                                    case 2 -> methods.calculateNet8();
                                    case 3 -> methods.calculateNet5();
                                    case 4 -> shouldContinueNet = false;
                                    default -> {
                                        System.out.println("Błąd wprowadzania\nSpróbuj ponownie.");
                                        {
                                        }
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz.");
                                scn.next();

                            }
                        }
                    }

                    case 3 -> {

                        shouldContinue = false;
                        System.out.println("Dziękujemy za skorzystanie z naszego programu.");
                    }
                    default -> System.out.println("Błąd!\nWybierz liczbę od 1 do 3.");

                }

            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz.");
                scn.next();

            }

        }
    }
}
