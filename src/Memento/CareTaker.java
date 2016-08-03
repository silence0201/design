package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: CareTaker
 * Author: silence
 * Update: silence(2016-08-01 20:29)
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
