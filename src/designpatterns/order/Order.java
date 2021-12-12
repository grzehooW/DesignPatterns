package designpatterns.order;

import designpatterns.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserver = new HashSet<>();

    public Order(long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void reisterObserver(Observer observer) {
        registeredObserver.add(observer);
    }

    @Override
    public void noregisterObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : registeredObserver){
            observer.update(this);
        }

    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notification();
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
