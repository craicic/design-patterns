package me.vaalp.oberserver;

/**
 * Also called Observable.
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
