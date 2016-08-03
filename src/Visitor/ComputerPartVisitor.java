package Visitor;

/**
 * Description: ComputerPartVisitor
 * Author: silence
 * Update: silence(2016-08-02 22:08)
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
