package Visitor;

/**
 * Description: Mouse
 * Author: silence
 * Update: silence(2016-08-02 22:09)
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
