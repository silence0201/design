package Prototype;

/**
 * Description: Circle
 * Author: silence
 * Update: silence(2016-07-29 22:39)
 */
public class Circle extends Shape {
    public Circle(){
        type = "圆形";
    }

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
