package be.heh.isims.ihm.tp2.ex1;

public class AffichageAllemagne implements IAffiche{
		@Override
		public String message(){
			return "Der Rechnungsbetrag ist : ";
		}
		
		@Override
		public String monnaie(double montant){
			return "€ " + montant;
		}
}