package Intercepting;

/**
 * Description: Client
 * Author: silence
 * Update: silence(2016-08-03 21:10)
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
