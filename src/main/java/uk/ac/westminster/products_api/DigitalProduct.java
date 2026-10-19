package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSize;

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




}
