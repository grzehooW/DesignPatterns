package designpatterns.notification;

import designpatterns.order.Order;

public class TextMessage implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Sms - zamowienie number : " + order.getOrderNumber() + " status zamowienia: " + order.getOrderStatus());
    }
}
