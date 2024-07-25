import javax.swing.*;
public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    Order(){

    }
    Order(int customerId, int orderId, Product[] products, float totalPrice){
        this.setCustomerId(customerId);
        this.setProducts(products);
        this.setOrderId(orderId);
        this.setTotalPrice(totalPrice);
    }


    public void setCustomerId(int customerId) {
        if(customerId>=0) {
            this.customerId = customerId;
        } else{
            this.customerId = Math.abs(customerId);
        }
    }
    public int getCustomerId() {
        return customerId;
    }


    public void setOrderId(int orderId) {
        if(orderId>=0) {
            this.orderId = orderId;
        } else{
            this.orderId = Math.abs(orderId);
        }
    }
    public int getOrderId() {
        return orderId;
    }


    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }


    public void setTotalPrice(float totalPrice) {
        if(customerId>=0) {
            this.totalPrice = totalPrice;
        } else{
            this.totalPrice = Math.abs(totalPrice);
        }
    }
    public float getTotalPrice() {
        return totalPrice;
    }


    public void printOrderInfo() {
        String pop = "";
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                pop += products[i].getName() + " - " + products[i].getPrice() + "$\n";
            }else {
                continue;
            }
        }
        JOptionPane.showMessageDialog(null,"Here's your order's summary:\nOrder ID: " + this.orderId + "\nCustomer ID: " + this.customerId +"\nProducts:\n"+pop + "your total price: " + this.getTotalPrice() + "$");
        JOptionPane.showMessageDialog(null,"Thanks for using our system\nEnjoy your products (:");
    }
}
