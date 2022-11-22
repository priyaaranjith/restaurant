import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buy {
    public static void main(String args[]) {
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';
        int flag1 = 0;
        Scanner sc = new Scanner(System.in);
        List<restaurant1> product = new ArrayList<restaurant1>();
        while (flag1 == 0) {
            System.out.println("1.Tea,2.Coffee 3.Snacks 4.Idli 5.Dosa");
            System.out.print("Enter Customer Name: ");
            String customername = sc.next();
            System.out.println("Enter customer mobile no:");
            int mobileno = sc.nextInt();
            do {
                System.out.print("Product ID: ");
                int id = sc.nextInt();
                System.out.print("Quantity: ");
                quantity = sc.nextInt();
                switch (id) {
                    case 1:
                        price = 10;
                        totalPrice = 10 * quantity;
                        break;
                    case 2:
                        price = 15;
                        totalPrice = 15 * quantity;
                        break;
                    case 3:
                        price = 20;
                        totalPrice = 10 * quantity;
                        break;
                    case 4:
                        price = 25;
                        totalPrice = 8 * quantity;
                        break;
                    case 5:
                        price = 30;
                        totalPrice = 6 * quantity;
                        break;
                    case 6:
                        choice = 'n';
                    default:
                        System.out.println("invalid input");
                }
                overAllPrice = overAllPrice + totalPrice;
                product.add(new restaurant1(customername,id, quantity, price, totalPrice));
                System.out.print("Want to add more items? (y or n): ");
                choice = sc.next().charAt(0);
                sc.nextLine();
            }
            while (choice == 'y' || choice == 'Y');
            int flag = 0;
            do {
                System.out.println("1.Generate Bill 2.View All transactions  3.Exit");
                int menu = sc.nextInt();
                System.out.println("customername: "+ customername);
                System.out.println("mobileno: "+ mobileno);
                switch (menu) {
                    case 1:
                        System.out.println("Total Amount (Rs.) " + overAllPrice);
                        break;
                    case 2:
                        for (restaurant1 p : product) {
                            p.display();
                        }
                        break;
                    case 3:
                        flag = 1;
                        break;
                }

            } while (flag == 0);


        }
    }
}
