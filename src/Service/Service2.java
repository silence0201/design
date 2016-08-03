package Service;

/**
 * Description: Service2
 * Author: silence
 * Update: silence(2016-08-03 21:12)
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
