import java.util.ArrayList;

public class Coordinateurs implements ISujet {

    /* Attributs */
    private ArrayList<IObserver> observers = new ArrayList<>();
    private String name;

    /* Getter / Setter */
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name; }

    /* Default Builder */
    public Coordinateurs() { }

    /* Builder Surcharge */
    public Coordinateurs(String name) { setName(name); }

    @Override
    public void Add(IObserver o) { observers.add(o); }

    @Override
    public void del(IObserver o) { observers.remove(o); }

    @Override
    public void Notify(int _matricule, String name) {  for (IObserver o: observers) { o.update(_matricule, name); } }
}
