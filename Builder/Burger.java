package Builder;

/**
 * Description: Burger
 * Author: silence
 * Update: silence(2016-07-29 22:28)
 */
public  abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
