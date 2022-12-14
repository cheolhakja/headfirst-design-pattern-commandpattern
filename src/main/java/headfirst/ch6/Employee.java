package headfirst.ch6;

public class Employee {

    //인보커 객체. 커맨드 객체에 명령을 내린다

    public void takeOrder() {
        Order order = Order.createOrder();
        order.start();
    }
}
