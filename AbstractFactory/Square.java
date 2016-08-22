package AbstractFactory;

/**
 * Description: Square
 * Author: silence
 * Update: silence(2016-07-29 22:03)
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
