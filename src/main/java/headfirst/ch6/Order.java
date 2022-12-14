package headfirst.ch6;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //커맨드 객체. 리시버 객체를 참조하고 있음.
    private List<String> foodList = new ArrayList<>();
    private Chef chef;

    public static Order createOrder() {
        //직관에 의해 팩토리 메서드 패턴을 사용하면 좋을 것 같다.
        return new Order();
    }

    public void start() {
        chef.cook();
    }
}
