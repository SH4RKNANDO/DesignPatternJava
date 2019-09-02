import java.util.ArrayList;

public abstract class Sujet {

    /* Attributs */
    private ArrayList<IObserver> observers = new ArrayList<>();

    public void Subscribe(IObserver o) {  observers.add(o); }
    public void UnSubscribe(IObserver o) { observers.remove(o); }
    public void Notify(Student s1, Student old) {  for(IObserver o : observers) o.update(s1, old); }
}
