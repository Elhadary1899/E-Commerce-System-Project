import javax.swing.*;

public class Customer {
    private int customerId;
    private String name;
    private String address;

    Customer(int id, String name, String address){
        this.setCustomerId(id);
        this.setName(name);
        this.setAddress(address);
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

    public void setName(String name) {
        if(name!=null && name.length()>0) {
            this.name = name;
        }else{
            JOptionPane.showMessageDialog(null,"Invalid input");
            System.exit(0);
        }
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        if(address!=null && address.length()>0) {
            this.address = address;
        }else{
            JOptionPane.showMessageDialog(null,"Invalid input");
            System.exit(0);
        }
    }
    public String getAddress() {
        return address;
    }


}
