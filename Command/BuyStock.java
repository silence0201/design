package Command;

/**
 * Description: BuyStock
 * Author: silence
 * Update: silence(2016-08-01 20:08)
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
