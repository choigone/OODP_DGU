//2016112182최고운

package com.top;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Subject subject);
}
class ProgramMonkeyObserver implements Observer {
    @Override
    public void update(Subject subject) {
        String state = ((SDKDownloadSubject)subject).getState();
        System.out.println("Programer look the SDK download process is: "+state);
    }
}
abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }




    public void motifyObservers() {
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
class SDKDownloadSubject extends Subject {
    private String mState;

    public String getState() {
        return mState;
    }
    public void netProcessChange(String data) {
        mState = data;
        this.motifyObservers();
    }
}

public class ObserverExercise{
    public static void main(String[] args) {
        SDKDownloadSubject sdkDownloadSubject = new SDKDownloadSubject();
        Observer observer = new ProgramMonkeyObserver();
        sdkDownloadSubject.attach(observer);
        sdkDownloadSubject.netProcessChange("1%");
        sdkDownloadSubject.netProcessChange("51%");
        sdkDownloadSubject.netProcessChange("100%");
    }
}
