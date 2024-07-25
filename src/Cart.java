import javax.swing.*;

public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products;


    Cart(int customerId,int nProducts){
        this.setCustomerId(customerId);
        this.setnProducts(nProducts);
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

    public void setnProducts(int nProducts) {
        if(nProducts>=0) {
            this.nProducts = nProducts;
             products = new Product[nProducts];
        } else{
            this.nProducts = Math.abs(nProducts);
        }
    }
    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }


    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (this.products[i] == null) {
                this.products[i] = product;
                break;
            }
        }
    }

    public void removeProduct(){
        int confirm_remove = Integer.parseInt(JOptionPane.showInputDialog("Do you want to remove any product from your cart? 1-Yes 2-No"));
        if (confirm_remove==1 || confirm_remove==-1) {
            int removed_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id of the item you want to remove"));
            for (int i = 0; i < nProducts; i++) {
                if (products[i].getProductId() == removed_id) {
                    products[i] = null;
                    break;
                } else {
                    continue;
                }
            }
        } else if (confirm_remove==2 || confirm_remove==-2) {
        } else {
            JOptionPane.showMessageDialog(null,"Invalid input");
        }
    }

    public float calculatePrice(){
        float price = 0;
        for (int i=0;i<nProducts;i++){
            if (products[i]!=null){
                price+=products[i].getPrice();
            }else {
                continue;
            }
        }
        return price;
    }

    public void placeOrder(){
        Order order = new Order(this.getCustomerId(),1,this.getProducts(), this.calculatePrice());
        order.printOrderInfo();
    }

}
