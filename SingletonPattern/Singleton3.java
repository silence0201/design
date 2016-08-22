package SingletonPattern;

/**
 * Description: Singleton3
 * Author: silence
 * Update: silence(2016-07-29 22:21)
 * 饿汉式加载
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}
