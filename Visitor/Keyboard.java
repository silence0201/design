package Visitor;

/**
 * Description: Keyboard
 * Author: silence
 * Update: silence(2016-08-02 22:07)
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
