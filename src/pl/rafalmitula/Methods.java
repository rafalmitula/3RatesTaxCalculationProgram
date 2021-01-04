package pl.rafalmitula;

import java.util.Scanner;

public class Methods {

public void calculateGross23() {
    System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 23%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

    try {

        Scanner scnB23 = new Scanner(System.in);
        double amountGrossCb23 = scnB23.nextDouble();
        double amountVatCb23 = (amountGrossCb23 * 0.23) / (1.23);
        double amountNetCb23 = (amountGrossCb23 / (123)) * 100;

        System.out.println(String.format("Kwota netto: %.2f", amountNetCb23));
        System.out.println(String.format("Kwota brutto: %.2f", amountGrossCb23));
        System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb23));

    } catch (Exception e) {

        System.out.println("Wprowadzone dane są nieprawidłowe!\nSpróbuj jeszcze raz");
        System.out.println();
        calculateGross23();
    }


}

    public void calculateGross8() {
        System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 8%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {

            Scanner scnB8 = new Scanner(System.in);
            double amountGrossCb8 = scnB8.nextDouble();
            double amountVatCb8 = (amountGrossCb8 * 0.08) / (1.08);
            double amountNetCb8 = (amountGrossCb8 / (108)) * 100;

            System.out.println(String.format("Kwota netto: %.2f", amountNetCb8));
            System.out.println(String.format("Kwota brutto: %.2f", amountGrossCb8));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb8));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są nieprawidłowe!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateGross8();
        }

    }

    public void calculateGross5() {
        System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 5%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {

            Scanner scnB5 = new Scanner(System.in);
            double amountGrossCb5 = scnB5.nextDouble();
            double amountVatCb5 = (amountGrossCb5 * 0.05) / (1.05);
            double amountNetCb5 = (amountGrossCb5 / (105)) * 100;

            System.out.println(String.format("Kwota netto: %.2f", amountNetCb5));
            System.out.println(String.format("Kwota brutto: %.2f", amountGrossCb5));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb5));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateGross5();

        }

    }

    public void calculateNet23() {
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 23%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {

            Scanner scnN23 = new Scanner(System.in);
            double amountNetN23 = scnN23.nextDouble();
            double amountVatN23 = amountNetN23 * 0.23;
            double amountGrossN23 = amountNetN23 * 1.23;

            System.out.println(String.format("Kwota netto: %.2f", amountNetN23));
            System.out.println(String.format("Kwota brutto: %.2f", amountGrossN23));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatN23));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateNet23();

        }

    }

    public void calculateNet8() {
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 8%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {

            Scanner scnN8 = new Scanner(System.in);
            double amountNetN8 = scnN8.nextDouble();
            double amountVatN8 = amountNetN8 * 0.08;
            double amountGrossN8 = amountNetN8 * 1.08;

            System.out.println(String.format("Kwota netto: %.2f", amountNetN8));
            System.out.println(String.format("Kwota brutto: %.2f", amountVatN8));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountGrossN8));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateNet8();

        }

    }

    public void calculateNet5() {
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 5%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem.");

        try {

            Scanner scnN5 = new Scanner(System.in);
            double amountNetN5 = scnN5.nextDouble();
            double amountVatN5 = amountNetN5 * 0.05;
            double amountGrossN5 = amountNetN5 * 1.05;

            System.out.println(String.format("Kwota netto: %.2f", amountNetN5));
            System.out.println(String.format("Kwota brutto: %.2f", amountVatN5));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountGrossN5));

        } catch (Exception e) {

            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz.");
            System.out.println();
            calculateNet5();

        }

    }

}
