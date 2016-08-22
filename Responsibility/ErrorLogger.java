package Responsibility;

/**
 * Description: ErrorLogger
 * Author: silence
 * Update: silence(2016-08-01 20:03)
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
