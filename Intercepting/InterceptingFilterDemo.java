package Intercepting;

/**
 * Description: InterceptingFilterDemo
 * Author: silence
 * Update: silence(2016-08-03 21:10)
 */
public class InterceptingFilterDemo  {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
