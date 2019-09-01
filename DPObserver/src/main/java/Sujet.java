import java.util.ArrayList;
import java.util.List;

public abstract class Sujet implements ISujet {

    private ArrayList<Observer> ObserverList = new ArrayList<>();

    @Override
    public void Abonne(Observer o) {  ObserverList.add(o);  }

    @Override
    public void Desabonne(Observer o) {  ObserverList.remove(o);  }

    @Override
    public void Notifie(String _name, int matricule) {  for(Observer o : ObserverList) o.Update(matricule, _name); }
}
