package Front;

/**
 * Description: FrontControllerPatternDemo
 * Author: silence
 * Update: silence(2016-08-03 21:06)
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
