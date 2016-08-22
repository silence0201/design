package Mediator;

/**
 * Description: MediatorPatternDemo
 * Author: silence
 * Update: silence(2016-08-01 20:24)
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
