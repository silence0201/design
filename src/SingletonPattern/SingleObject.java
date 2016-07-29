package SingletonPattern;

/**
 * Description: SingleObject
 * Author: silence
 * Update: silence(2016-07-29 22:16)
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("我是一个单例"+this);
    }
}
