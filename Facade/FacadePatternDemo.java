package Facade;

/**
 * Description: FacadePatternDemo
 * Author: silence
 * Update: silence(2016-07-29 23:23)
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
