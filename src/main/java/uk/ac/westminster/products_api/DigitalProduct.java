package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSize;
    private double discountedPrice;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id, String name, double price,String downloadUrl,double fileSize){
        super(id, name, price);
        this.fileSize=fileSize;
        this.downloadUrl=downloadUrl;

    }
    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSize(){
        return fileSize;




    }
    @Override
    public String getSummary(){
        return "Product : Name:" + getName() +
                "| Price:" + getPrice() +
                "| URL:"+downloadUrl+
                "|File size MB:"+fileSize;
    }

    @Override
    public void applyDiscount(double rate){
        discountedPrice=getPrice()*(1-rate);

    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }




}
