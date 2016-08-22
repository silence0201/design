package Command;

/**
 * Description: SellStock
 * Author: silence
 * Update: silence(2016-08-01 20:09)
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
