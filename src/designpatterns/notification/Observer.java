package designpatterns.notification;

import designpatterns.order.Order;

public interface Observer {

    void update(Order order);
}
