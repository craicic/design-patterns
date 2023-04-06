package me.vaalp.oberserver;

import java.util.LinkedList;

public class ConcreteSubject implements Subject {
    private int subjectState;

    private final LinkedList<Observer> list;

    public ConcreteSubject() {
        this.list = new LinkedList<>();
        this.subjectState = 0;
    }

    @Override
    public void attach(Observer o) {
        System.out.println("Attached an observer !");
        this.list.add(o);
    }

    @Override
    public void detach(Observer o) {
        System.out.println("Detached an observer !");
        this.list.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify " + list.size() + " observer(s)");
        for (Observer o :
                list) {
            o.update();
        }
    }

    public int getSubjectState() {
        return subjectState;
    }

    public void incState() {
        System.out.println("In Subject : incrementing state...");
        this.subjectState ++;
        this.notifyObservers();
    }
}
