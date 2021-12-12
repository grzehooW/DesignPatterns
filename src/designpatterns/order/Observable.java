package designpatterns.order;

import designpatterns.notification.Observer;

public interface Observable {

    void reisterObserver(Observer observer);
    void noregisterObserver(Observer observer);
    void notification();
}
