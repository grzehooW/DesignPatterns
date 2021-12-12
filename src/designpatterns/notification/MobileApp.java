package designpatterns.notification;

import designpatterns.order.Order;

public class MobileApp implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("Mobilna applikacja - zamowienie number : " + order.getOrderNumber() + " status zamowienia: " + order.getOrderStatus());
    }
}
