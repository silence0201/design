package State;

/**
 * Description: StopState
 * Author: silence
 * Update: silence(2016-08-01 20:40)
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
