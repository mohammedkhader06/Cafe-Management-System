package app;

import model.Snack;
import service.CafeManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CafeManager manager = new CafeManager();
        int choice = 0;

        while(choice != 6) {

            System.out.println("\n===== CAFE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Drink");
            System.out.println("2. Add Snack");
            System.out.println("3. Display Orders");
            System.out.println("4. Search Order");
            System.out.println("5. Remove Order");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {
                choice = input.nextInt();
            }
            catch(Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine();
                continue;
            }

            switch(choice) {

                case 2:
                    try {
                        System.out.print("Enter snack name: ");
                        String sName = input.next();

                        System.out.print("Enter snack price: ");
                        double sPrice = input.nextDouble();

                        System.out.print("Enter quantity: ");
                        int sQuantity = input.nextInt();

                        manager.addOrder(new Snack(sName, sPrice, sQuantity));
                    }
                    catch(Exception e) {
                        System.out.println("Invalid input!");
                        input.nextLine();
                    }
                    break;

                case 5:
                    System.out.print("Enter item name to remove: ");
                    String removeName = input.next();
                    manager.removeOrder(removeName);
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        input.close();
    }
}