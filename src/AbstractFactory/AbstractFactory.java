package AbstractFactory;

/**
 * Description: AbstractFactory
 * Author: silence
 * Update: silence(2016-07-29 22:07)
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
