package Facade;

/**
 * Description: Square
 * Author: silence
 * Update: silence(2016-07-29 23:22)
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
