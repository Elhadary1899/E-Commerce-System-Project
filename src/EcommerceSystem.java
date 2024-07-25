import javax.swing.*;
import java.util.Scanner;

class EcommerceSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Instantializing the classes
        JOptionPane.showMessageDialog(null,"Welcome to the ECommerce system");
        ElectronicProducts E = new ElectronicProducts(1,"smartphone",599.9f,"samsung",1);
        ClothingProduct C = new ClothingProduct(2,"t-shirt",19.99f,"medium","cotton");
        BookProduct B = new BookProduct(3,"OOP",39.99f,"o'Reilly","x publications");

        //Taking inputs from the user + instantializing the Customer class
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter your id:"));
        String name = JOptionPane.showInputDialog("Enter your name:");
        String address = JOptionPane.showInputDialog ("Enter your address:");
        Customer U = new Customer(id,name,address);

        //Instantializing the Cart class + taking the number of products as input
        int nProducts = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("How many products do you want to add to your cart?")));
        Cart cart = new Cart(U.getCustomerId(),nProducts);

        //looping on the products to see what the customer wants
        for (int i=0;i<nProducts;i++){
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1-" + E.getName() + " 2-" + C.getName() + " 3-" + B.getName()));
            if (choice == 1 || choice == -1) {
                cart.addProduct(E);
            } else if (choice == 2 || choice == -2) {
                cart.addProduct(C);
            } else if (choice == 3 ||choice == -3) {
                cart.addProduct(B);
            }else {
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
        }

        //to make sure if the customer wants to remove any product from his cart
        cart.removeProduct();

        //to confirm the order + printing the total order
        JOptionPane.showMessageDialog(null, "your total price is: "+cart.calculatePrice() + "$");
        int option = Integer.parseInt( JOptionPane.showInputDialog("Would you like to confirm the order 1-Yes 2-No"));
        if (option == 1 || option == -1) {
            cart.placeOrder();
        }else if(option == 2 || option == -2) {
            JOptionPane.showMessageDialog(null,"Order cancelled\nThanks for using our system");
        }else {
            JOptionPane.showMessageDialog(null,"Invalid input");
        }

    }
}
