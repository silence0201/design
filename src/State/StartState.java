package State;

/**
 * Description: StartState
 * Author: silence
 * Update: silence(2016-08-01 20:39)
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
