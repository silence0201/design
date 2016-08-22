package NullObject;

/**
 * Description: NullCustomer
 * Author: silence
 * Update: silence(2016-08-01 20:44)
 */
public class NullCustomer  extends AbstractCustomer{
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
