package AbstractFactory;

/**
 * Description: ColorFactory
 * Author: silence
 * Update: silence(2016-07-29 22:10)
 */
public class ColorFactory extends AbstractFactory {
    @Override
   Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
