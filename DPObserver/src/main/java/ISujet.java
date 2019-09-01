import java.util.List;

public interface ISujet {
    public void Abonne(Observer o);
    public void Desabonne(Observer o);
    public void Notifie(String _name, int matricule);
}
