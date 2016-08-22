package Prototype;

/**
 * Description: Square
 * Author: silence
 * Update: silence(2016-07-29 22:38)
 */
public class Square extends Shape {
    public Square(){
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
