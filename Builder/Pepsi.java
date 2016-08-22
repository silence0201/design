package Builder;

/**
 * Description: Pepsi
 * Author: silence
 * Update: silence(2016-07-29 22:30)
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
