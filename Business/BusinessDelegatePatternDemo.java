package Business;

/**
 * Description: BusinessDelegatePatternDemo
 * Author: silence
 * Update: silence(2016-08-02 22:42)
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
