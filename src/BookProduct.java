public class BookProduct extends Product{
    private String author;
    private String publisher;

    BookProduct(){

    }
    BookProduct(int productId, String name, float price, String author, String publisher){
        super(productId,name,price);
    }

    public void setAuthor(String author) {
        if(author!=null && author.length()>0) {
            this.author = author;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        if(publisher!=null && publisher.length()>0) {
            this.publisher = publisher;
        }else{
            System.out.println("Invalid input");
        }
    }
    public String getPublisher() {
        return publisher;
    }


}
