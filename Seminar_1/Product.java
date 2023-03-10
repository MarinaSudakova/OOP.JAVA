package Seminar_1;

public class Product {
    private double cost;
    private String name;
    public Product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s : %f", getName(), getCost());
    }

    public double getCost() {
        return cost;
    }



}