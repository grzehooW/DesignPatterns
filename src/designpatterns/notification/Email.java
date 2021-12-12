package designpatterns.notification;

import designpatterns.order.Order;

public class Email implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Email - zamowienie number : " + order.getOrderNumber() + " status zamowienia: " + order.getOrderStatus());
    }
}
