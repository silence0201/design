package Builder;

/**
 * Description: ChickenBurger
 * Author: silence
 * Update: silence(2016-07-29 22:30)
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
