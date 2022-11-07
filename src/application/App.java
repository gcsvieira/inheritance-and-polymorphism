package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        Boolean nextProduct = true;
        Integer indexProduct = 1;

        do {
            System.out.println("Product #" + indexProduct + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            Character typeProduct = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            Double price = Double.parseDouble(scan.nextLine());

            if (typeProduct == 'c') {
                product.add(new Product(name, price));
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = scan.nextLine();
                product.add(new UsedProduct(name, price, manufactureDate));
            } else if (typeProduct == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = Double.parseDouble(scan.nextLine());
                product.add(new ImportedProduct(name, price, customsFee));
            }

            System.out.print("Do you wish to add another product? ");
            Character choice = scan.next().charAt(0);
            if (choice == 'n' || choice == 'N')
                nextProduct = false;

            indexProduct++;
        } while (nextProduct == true);

        System.out.println("PRICE TAGS:");
        for (Product prod : product) {
            System.out.println(prod);
        }

        scan.close();
    }
}
