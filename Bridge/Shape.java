package Bridge;

/**
 * Description: Shape
 * Author: silence
 * Update: silence(2016-07-29 22:52)
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
