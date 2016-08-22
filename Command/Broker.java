package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Broker
 * Author: silence
 * Update: silence(2016-08-01 20:10)
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
