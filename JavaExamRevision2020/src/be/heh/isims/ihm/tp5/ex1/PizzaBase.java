package be.heh.isims.ihm.tp5.ex1;

public class PizzaBase implements IPizza{

    // Attributs
    private int choix;
    private double prix;
    private String choixDesc;

    // Constructeur
    public PizzaBase(int choix) { this.Choix(choix); }

    // Getters et setters
    public double getPrix() {
        return this.prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getChoix() { return this.choix; }
    public void setChoix(int choix) {
        this.choix = choix;
    }
    public String getChoixDesc() { return choixDesc; }
    public void setChoixDesc(String getChoixDesc) { this.choixDesc = getChoixDesc; }

    // Méthodes
    @Override
    public void afficheDescription() { System.out.println("[*] Pizza " + this.getChoixDesc() + " [" + this.prix + "€]"); }

    @Override
    public Double calculePrix() { return this.prix; }

    public void Choix(int choix){
            switch (choix){
            case 1:
                this.prix = 7;
                this.setChoixDesc("classique");
                break;
            case 2:
                this.prix = 12;
                this.setChoixDesc("fourre au fromage");
                break;
            case 3:
                this.prix = 9;
                this.setChoixDesc("fourre au fromage");
                break;
        }
    }
}
