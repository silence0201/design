package Builder;

/**
 * Description: ColdDrink
 * Author: silence
 * Update: silence(2016-07-29 22:29)
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
