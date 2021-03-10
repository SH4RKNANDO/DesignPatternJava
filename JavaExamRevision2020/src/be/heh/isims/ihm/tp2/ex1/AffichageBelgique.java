package be.heh.isims.ihm.tp2.ex1;

public class AffichageBelgique implements IAffiche{
		@Override
		public String message(){
			return "Le montant de la facture est : ";
		}
		
		@Override
		public String monnaie(double montant){
			return montant+" �";
		}
}