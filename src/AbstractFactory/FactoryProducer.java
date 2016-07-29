package AbstractFactory;

/**
 * Description: FactoryProducer
 * Author: silence
 * Update: silence(2016-07-29 22:12)
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
