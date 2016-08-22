package Memento;

/**
 * Description: Memento
 * Author: silence
 * Update: silence(2016-08-01 20:27)
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
