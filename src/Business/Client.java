package Business;

import Business.BusinessDelegate;

/**
 * Description: Client
 * Author: silence
 * Update: silence(2016-08-02 22:41)
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
