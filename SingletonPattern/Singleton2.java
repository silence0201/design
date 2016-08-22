package SingletonPattern;

/**
 * Description: Singleton2
 * Author: silence
 * Update: silence(2016-07-29 22:20)
 * 加同步的懒汉式加载
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
