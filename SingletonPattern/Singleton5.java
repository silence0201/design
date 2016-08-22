package SingletonPattern;

/**
 * Description: Singleton5
 * Author: silence
 * Update: silence(2016-07-29 22:23)
 * 登记式/静态内部类
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5 (){}
    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
