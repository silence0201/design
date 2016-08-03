package State;

/**
 * Description: Context
 * Author: silence
 * Update: silence(2016-08-01 20:40)
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
