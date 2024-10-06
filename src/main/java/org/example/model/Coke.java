package org.example.model;

public class Coke extends  ProductForSale {

    private double acidPercentage;

    public Coke(String type, double price, String description, double acidPercentage) {
        super(type, price, description);
        this.acidPercentage = acidPercentage;
    }

    public Coke(String type, double price, String description){
        super(type,price,description);

    }


    public double getAcidPercentage() {
        return acidPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke{" +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' + ", acidPercentage='" + getAcidPercentage() + '\'' +
                '}');
    }
}
