package Service;

/**
 * Description: Service1
 * Author: silence
 * Update: silence(2016-08-03 21:12)
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
