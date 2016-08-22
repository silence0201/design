package Responsibility;

/**
 * Description: ConsoleLogger
 * Author: silence
 * Update: silence(2016-08-01 20:02)
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
