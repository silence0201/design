package Bridge;

/**
 * Description: BridgePatternDemo
 * Author: silence
 * Update: silence(2016-07-29 22:53)
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
