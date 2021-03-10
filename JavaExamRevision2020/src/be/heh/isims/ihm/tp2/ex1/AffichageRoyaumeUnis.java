package be.heh.isims.ihm.tp2.ex1;

public class AffichageRoyaumeUnis implements IAffiche{
		@Override
		public String message(){
			return "The amount of the invoice is : ";
		}
		
		@Override
		public String monnaie(double montant){
			return "� "+montant;
		}
}