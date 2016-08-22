package Decorator;

/**
 * Description: ShapeDecorator
 * Author: silence
 * Update: silence(2016-07-29 23:13)
 */
public  abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
