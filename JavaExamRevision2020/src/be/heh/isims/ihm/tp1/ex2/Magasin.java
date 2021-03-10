package be.heh.isims.ihm.tp1.ex2;

public class Magasin implements IBilan {

	/* Attributs */
	private double benefice;
	
	/* Default Builder */
	public Magasin(double benefice) { this.benefice = benefice; }
	
	/* Getters/Setters */
	public double getBenefice(){ return this.benefice; }
	public void setBenefice(double benefice){ this.benefice = benefice; }

	/* Méthodes */
	@Override
	public double calculeBenefice(){ return this.getBenefice(); }

}