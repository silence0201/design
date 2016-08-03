package Business;

/**
 * Description: EJBService
 * Author: silence
 * Update: silence(2016-08-02 22:37)
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
