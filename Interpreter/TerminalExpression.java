package Interpreter;

/**
 * Description: TerminalExpression
 * Author: silence
 * Update: silence(2016-08-01 20:13)
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
