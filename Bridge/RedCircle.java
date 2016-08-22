package Bridge;

/**
 * Description: RedCircle
 * Author: silence
 * Update: silence(2016-07-29 22:51)
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
