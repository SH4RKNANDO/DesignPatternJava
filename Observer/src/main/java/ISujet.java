import java.util.ArrayList;

public interface ISujet {
    public void Add(IObserver o);
    public void del(IObserver o);
    public void Notify(int matricule, String name);
}
