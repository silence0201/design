package Mediator;

import java.util.Date;

/**
 * Description: ChatRoom
 * Author: silence
 * Update: silence(2016-08-01 20:23)
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
