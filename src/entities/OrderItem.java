package entities;

public class OrderItem {
    private Double price;
    private Integer quantity;
    private Product product;

    public OrderItem(Double price, Integer quantity, Product product) {
        this.price = product.getPrice();
        this.quantity = quantity;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double subTotal(){
        return price * quantity;
    }
}
