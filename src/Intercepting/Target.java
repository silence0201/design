package Intercepting;

/**
 * Description: Target
 * Author: silence
 * Update: silence(2016-08-03 21:09)
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
