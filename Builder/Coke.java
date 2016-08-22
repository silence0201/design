package Builder;

/**
 * Description: Coke
 * Author: silence
 * Update: silence(2016-07-29 22:30)
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
