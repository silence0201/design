package Intercepting;

/**
 * Description: AuthenticationFilter
 * Author: silence
 * Update: silence(2016-08-03 21:08)
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
