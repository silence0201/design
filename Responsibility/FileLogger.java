package Responsibility;

/**
 * Description: FileLogger
 * Author: silence
 * Update: silence(2016-08-01 20:04)
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
