package entities;

import enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private LocalDateTime moment;
    private RestaurantTable table;
    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;

    public Order(Integer id, LocalDateTime moment, OrderStatus status, RestaurantTable table) {
        this.id = id;
        this.moment = LocalDateTime.now();
        this.status = OrderStatus.OPEN;
        this.table = table;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public RestaurantTable getTable() {
        return table;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public void startOrder(){
        status = OrderStatus.IN_PREPARATION;
    }
    public void deliverOrder(){
        status = OrderStatus.DELIVERED;
    }
    public void closeOrder(){
        status = OrderStatus.CLOSED;
    }
    public void cancelOrder(){
        status = OrderStatus.CANCELED;
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem item : items){
            sum+= item.subTotal();
        }
        return sum;
    }







}
