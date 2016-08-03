package Business;

/**
 * Description: BusinessLookUp
 * Author: silence
 * Update: silence(2016-08-02 22:38)
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
