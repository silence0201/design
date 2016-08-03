package Business;

/**
 * Description: JMSService
 * Author: silence
 * Update: silence(2016-08-02 22:38)
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
