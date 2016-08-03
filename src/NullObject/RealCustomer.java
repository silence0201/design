package NullObject;

/**
 * Description: RealCustomer
 * Author: silence
 * Update: silence(2016-08-01 20:43)
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
