public class ElectronicProducts extends Product{
    private String brand;
    private int warrantyPeriod;

    ElectronicProducts(){

    }
    ElectronicProducts(int productId, String name, float price, String brand, int warrantyPeriod){
        super(productId,name,price);
        this.setBrand(brand);
        this.setWarrantyPeriod(warrantyPeriod);
    }

    public void setBrand(String brand) {
        if(brand!=null && brand.length()>0) {
            this.brand = brand;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getBrand() {
        return brand;
    }


    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod>=0) {
            this.warrantyPeriod = warrantyPeriod;
        } else{
            this.warrantyPeriod = Math.abs(warrantyPeriod);
        }
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }


}
