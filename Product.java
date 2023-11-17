package JV4;

//Product.java
public class Product {
	protected String name;
    protected double price;
    protected String brand;

    // Constructors, getters, and setters
    public Product(String name, double price, String brand) {
        this. name = name;
        this.price = price;
        this.brand = brand;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nBrand: " + brand;
    }
}

