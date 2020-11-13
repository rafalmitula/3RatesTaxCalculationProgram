package pl.rafalmitula;

import java.util.Scanner;

public class Methods {


public void calculateBrutto23(){
    System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 23%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

    try {

        Scanner scnB23 = new Scanner(System.in);
        double amountCb23 = scnB23.nextDouble();

        double amountVatCb23 = (amountCb23 * 0.23)/(1.23);
        double amountNettoCb23 = (amountCb23/(123))*100;

        System.out.println(String.format("Kwota netto: %.2f", amountNettoCb23));
        System.out.println(String.format("Kwota brutto: %.2f", amountCb23));
        System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb23));

    } catch (Exception e) {

        System.out.println("Wprowadzone dane są nieprawidłowe!\nSpróbuj jeszcze raz");
        System.out.println();
        calculateBrutto23();
    }


}

public void calculateBrutto8(){
    System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 8%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

    try {
        Scanner scnB8 = new Scanner(System.in);
        double amountCb8 = scnB8.nextDouble();

        double amountVatCb8 = (amountCb8 * 0.08)/(1.08);
        double amountNettoCb8 = (amountCb8/(108))*100;

        System.out.println(String.format("Kwota netto: %.2f", amountNettoCb8));
        System.out.println(String.format("Kwota brutto: %.2f", amountCb8));
        System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb8));
    } catch (Exception e) {
        System.out.println("Wprowadzone dane są nieprawidłowe!\nSpróbuj jeszcze raz");
        System.out.println();
        calculateBrutto8();
    }

    }

    public void calculateBrutto5(){
        System.out.println("Podaj kwotę brutto od jakiej chcesz obliczyć VAT 5%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {
            Scanner scnB5 = new Scanner(System.in);
            double amountCb5 = scnB5.nextDouble();

            double amountVatCb5 = (amountCb5 * 0.05)/(1.05);
            double amountNettoCb5 = (amountCb5/(105))*100;

            System.out.println(String.format("Kwota netto: %.2f", amountNettoCb5));
            System.out.println(String.format("Kwota brutto: %.2f", amountCb5));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatCb5));
        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateBrutto5();
        }

    }

    public void calculateNetto23(){
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 23%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {
            Scanner scnN23 = new Scanner(System.in);
            double amountN23 = scnN23.nextDouble();
            double amountVatN23 = amountN23*0.23;
            double amountBruttoN23 = amountN23*1.23;

            System.out.println(String.format("Kwota netto: %.2f", amountN23));
            System.out.println(String.format("Kwota brutto: %.2f", amountBruttoN23));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountVatN23));

        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateNetto23();

        }

    }
    public void calculateNetto8(){
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 8%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {
            Scanner scnN8 = new Scanner(System.in);
            double amountN8 = scnN8.nextDouble();
            double amountVatN8 = amountN8*0.08;
            double amountBruttoN8 = amountN8*1.08;

            System.out.println(String.format("Kwota netto: %.2f", amountN8));
            System.out.println(String.format("Kwota brutto: %.2f", amountVatN8));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountBruttoN8));

        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateNetto8();

        }


    }
    public void calculateNetto5(){
        System.out.println("Podaj kwotę netto od jakiej chcesz obliczyć VAT 5%" + "\nW przypadku części dziesiętnych oddziel je przecinkiem");

        try {
            Scanner scnN5 = new Scanner(System.in);
            double amountN5 = scnN5.nextDouble();
            double amountVatN5 = amountN5*0.05;
            double amountBruttoN5 = amountN5*1.05;

            System.out.println(String.format("Kwota netto: %.2f", amountN5));
            System.out.println(String.format("Kwota brutto: %.2f", amountVatN5));
            System.out.println(String.format("Kwota podatku VAT: %.2f", amountBruttoN5));

        } catch (Exception e) {
            System.out.println("Wprowadzone dane są niepoprawne!\nSpróbuj jeszcze raz");
            System.out.println();
            calculateNetto5();

        }

    }


}
