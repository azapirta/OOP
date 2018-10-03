package Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OOP2 {

    public static void main(String[] args) {

        List<CatalogProduse> CatalogProduse = new ArrayList<>();

        CatalogProduse.add(new Watch());
        CatalogProduse.add(new Bracelet());
        CatalogProduse.add(new Parfum());
        CatalogProduse.add(new Phone());
        CatalogProduse.add(new Laptop());

        System.out.println("Lista de produse: ");
        int index;
        for (index = 0; index < CatalogProduse.size(); index++) {

            CatalogProduse produs = CatalogProduse.get(index);
            System.out.println((index) + " " + produs.getName() + " (" + produs.getPrice() + "$)");
        }

        System.out.println();

        System.out.println("Buy your products (0 - 4)");

        Scanner scan = new Scanner(System.in);

        String answer;
        double sum = 0;
        do {
            String produsCumparat = scan.nextLine();
            CatalogProduse prod;
            switch (produsCumparat) {
                case "0": {
                    System.out.println("You added a watch to your cart");
                    prod = CatalogProduse.get(0);
                    sum += prod.getPrice();
                    break;
                }
                case "1": {
                    System.out.println("You added a bracelet to your cart");
                    prod = CatalogProduse.get(1);
                    sum += prod.getPrice();
                    break;
                }

                case "2": {
                    System.out.println("You added a parfum to your cart");
                    prod = CatalogProduse.get(2);
                    sum += prod.getPrice();
                    break;
                }
                case "3": {
                    System.out.println("You added a phone to your cart");
                    prod = CatalogProduse.get(3);
                    sum += prod.getPrice();
                    break;
                }
                case "4": {
                    System.out.println("You added a laptop to your cart");
                    prod = CatalogProduse.get(4);
                    sum += prod.getPrice();
                    break;
                }
            }
            System.out.println("Do you want to buy more? (yes / no)");
            answer = scan.nextLine();
            if (answer.equals("yes"))
                System.out.println("What product do you want?");
        }while(answer.equals("yes"));
        System.out.println("Total price = " + sum + "$");
    }
}
