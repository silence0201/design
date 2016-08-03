package Bridge;

/**
 * Description: GreenCircle
 * Author: silence
 * Update: silence(2016-07-29 22:52)
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
