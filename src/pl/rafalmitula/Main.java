package pl.rafalmitula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witamy w programie do rozliczania VATu");
        System.out.println();

        boolean shouldContinue = true;
        Scanner scn = new Scanner(System.in);
        Methods metody = new Methods();

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


                            Scanner scn2 = new Scanner(System.in);
                            boolean shouldContinueBrutto = true;

                        while (shouldContinueBrutto) {
                            System.out.println();
                            System.out.println("Wybierz opcję od 1 do 4:\n1. 23%\n2. 8%\n3. 5%\n4. Powrót");

                            try {

                                int userChoiceBrutto = scn2.nextInt();

                                switch (userChoiceBrutto) {

                                    case 1 -> metody.calculateBrutto23();
                                    case 2 -> metody.calculateBrutto8();
                                    case 3 -> metody.calculateBrutto5();
                                    case 4 -> shouldContinueBrutto = false;
                                    default -> {
                                        System.out.println("Błąd wprowadzania!\nSpróbuj ponownie"); {

                                        }
                                    }
                                }

                            } catch (InputMismatchException e) {
                                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz");
                                scn2.next();

                            }

                        }



                    }

                    case 2 -> {


                            Scanner scn3 = new Scanner(System.in);
                            boolean shouldContinueNetto = true;

                        while (shouldContinueNetto) {
                            System.out.println();
                            System.out.println("Wybierz stawke VAT:\n1. 23%\n2. 8%\n3. 5%\n4. Powrót");

                            try {

                               int userChoiceNetto = scn3.nextInt();

                                switch (userChoiceNetto) {
                                    case 1 -> metody.calculateNetto23();
                                    case 2 -> metody.calculateNetto8();
                                    case 3 -> metody.calculateNetto5();
                                    case 4 -> shouldContinueNetto = false;
                                    default -> {
                                        System.out.println("Błąd wprowadzania\nSpróbuj ponownie"); {
                                        }
                                    }
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz");
                                scn3.next();

                            }
                        }
                    }

                    case 3 -> {
                        shouldContinue = false;
                        System.out.println("Dziękujemy za skorzystanie z naszego programu.");
                    }
                    default ->
                        System.out.println("Błąd!\nWybierz liczbę od 1 do 3");

                }
            } catch (InputMismatchException e1) {
                System.out.println("Wprowadzono niepoprawne dane!\nSpróbuj jeszcze raz");
                scn.next();

            }


        }
    }
}
