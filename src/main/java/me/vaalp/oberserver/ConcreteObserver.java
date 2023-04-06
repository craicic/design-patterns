package me.vaalp.oberserver;

public class ConcreteObserver implements Observer {
    private int observerState;

    private final ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.observerState = this.subject.getSubjectState();
        System.out.println("In Observer : New value :" + observerState);
    }
}
