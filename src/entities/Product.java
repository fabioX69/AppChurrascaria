package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String category;
    private Double price;
    private List<OrderItem> items = new ArrayList<>();
    public Product (){

    }

    public Product(String category, Double price, String name) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




}
