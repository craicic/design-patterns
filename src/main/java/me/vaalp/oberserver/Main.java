package me.vaalp.oberserver;


public class Main {

    public static void main(String[] args)  {
       ConcreteSubject s = new ConcreteSubject();
       ConcreteObserver o = new ConcreteObserver(s);

       s.attach(o);
       s.incState();
       s.incState();


       s.detach(o);
       s.incState();
       s.incState();

       s.attach(o);
       s.incState();
    }
}