package designpatterns;

import designpatterns.notification.Email;
import designpatterns.notification.MobileApp;
import designpatterns.notification.TextMessage;
import designpatterns.order.Order;
import designpatterns.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(11L, OrderStatus.ZAMOWIENIE);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        order.reisterObserver(textMessage);
        order.reisterObserver(email);
        order.reisterObserver(mobileApp);

        order.notification();

        System.out.println("-------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);

        System.out.println("-------------------------------");

        order.noregisterObserver(email);

        order.changeOrderStatus(OrderStatus.DORECZONE);


    }
}
