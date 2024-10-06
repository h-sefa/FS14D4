package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale bread1 = new Bread("Bakery Products",10,"hot oven products","Rye Flour");
        ProductForSale bread2 = new Bread("Bakery Products",10,"hot oven products","Corn Flour");
        ProductForSale coke = new Coke("Drinks",50,"Drink it cold.",72.6);
        ProductForSale chocolate = new Chocolate("Drinks",50,"Drink it cold.","White Chocolate");

        ProductForSale[] products = {bread1,bread2,coke,chocolate};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}