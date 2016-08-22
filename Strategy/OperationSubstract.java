package Strategy;

/**
 * Description: OperationSubstract
 * Author: silence
 * Update: silence(2016-08-02 22:01)
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
