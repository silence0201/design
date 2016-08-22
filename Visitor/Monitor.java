package Visitor;

/**
 * Description: Monitor
 * Author: silence
 * Update: silence(2016-08-02 22:08)
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
