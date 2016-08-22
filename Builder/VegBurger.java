package Builder;

/**
 * Description: VegBurger
 * Author: silence
 * Update: silence(2016-07-29 22:29)
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
