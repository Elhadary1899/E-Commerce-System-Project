public class Product {
    protected int productId;
    protected String name;
    protected float price;

    Product(){

    }
    Product(int productId, String name, float price){
        this.setProductId(productId);
        this.setName(name);
        this.setPrice(price);
    }


    public void setProductId(int productId) {
        if(productId>=0) {
            this.productId = productId;
        } else{
            this.productId = Math.abs(productId);
        }
    }
    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        if(name!=null && name.length()>0) {
            this.name = name;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        if(price>=0) {
            this.price = price;
        } else{
            this.price = Math.abs(price);
        }
    }
    public float getPrice() {
        return price;
    }


}
