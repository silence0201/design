package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Subject
 * Author: silence
 * Update: silence(2016-08-01 20:30)
 */
public class Subject {private List<Observer> observers
        = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
