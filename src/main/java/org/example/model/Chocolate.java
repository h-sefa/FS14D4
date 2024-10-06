package org.example.model;

public class Chocolate extends ProductForSale{

    private String chocolateTypes;

    public Chocolate(String type, double price, String description, String chocolateTypes) {
        super(type, price, description);
        this.chocolateTypes = chocolateTypes;
    }

    public Chocolate(String type, double price, String description){
        super(type,price,description);

    }


    public String getChocolateTypes() {
        return chocolateTypes;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate{" +
                "type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' + ", chocolateTypes='" + getChocolateTypes() + '\'' +
                '}');
    }
}
