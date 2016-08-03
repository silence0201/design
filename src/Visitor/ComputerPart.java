package Visitor;

/**
 * Description: ComputerPart
 * Author: silence
 * Update: silence(2016-08-02 22:07)
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
