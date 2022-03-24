package src;

import java.time.LocalDateTime;

public class Order {

    private int itemId;
    private int customerId;
    private LocalDateTime orderTime;
    private boolean isApproved;
    private boolean completed;

    //notify customer of daily special before making order
    public void makeOrder(int customerId, Order order)
    {



    }
    //chef marks complete order
    public void orderCompleted()
    {
        this.completed = true;

    }

}

/*
If
an order has not been completed then it will need to appear on a list of orders.
 A screen should be
avaliable in the system to be able to display this typ

 */
