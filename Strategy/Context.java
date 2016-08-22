package Strategy;

/**
 * Description: Context
 * Author: silence
 * Update: silence(2016-08-02 22:00)
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
