package SingletonPattern;

/**
 * Description: Singleton1
 * Author: silence
 * Update: silence(2016-07-29 22:19)
 * 懒汉式加载
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
