package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimension;
    private double discountedPrice;



    public PhysicalProduct() {

    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimension) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimension = dimension;

    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimension() {
        return dimension;
    }

    @Override
    public String getSummary() {
        return "Product : Name:" + getName() +
                "| Price:" + getPrice() +
                "| Weight" + weightKg +
                "| Dimensions " + dimension;


    }

    @Override
    public void applyDiscount(double rate){
        double capped = Math.min(rate, 0.20);
        discountedPrice=getPrice()*(1-capped);


    }
    @Override
    public double getDiscountedPrice() {

        return discountedPrice;
    }





}