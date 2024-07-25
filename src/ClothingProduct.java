public class ClothingProduct extends Product{
    private String size;
    private String fabric;

    ClothingProduct(){

    }
    ClothingProduct(int productId, String name, float price, String size, String fabric){
        super(productId,name,price);
        this.setSize(size);
        this.setFabric(fabric);
    }

    public void setSize(String size) {
        if(size!=null && size.length()>0) {
            this.size = size;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        if(fabric!=null && fabric.length()>0) {
            this.fabric = fabric;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getFabric() {
        return fabric;
    }


}
