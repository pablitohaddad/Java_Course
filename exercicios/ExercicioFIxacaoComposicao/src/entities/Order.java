package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }
    public void addItem(OrderItem status){
        items.add(status);
    }
    public void removeItem(OrderItem status){
        items.remove(status);
    }
    public double total(){
        double totalPrice = 0.0;
        for(OrderItem i : items){
            totalPrice += i.subTotal();
        }
        return totalPrice;

    }

}
