package Prototype;

/**
 * Description: Rectangle
 * Author: silence
 * Update: silence(2016-07-29 22:37)
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "矩形";
    }

    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
