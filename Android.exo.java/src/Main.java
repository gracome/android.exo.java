package fr.omega.projet1;

public class Main {
	

	public static void main(String[] args) {
		Fille1 ainer = new Fille1();
		
		ainer.Nom();
		ainer.Prenom();		
	System.out.println("elle a " +  ainer.age() + "ans");
	ainer.profession();
	System.out.println(ainer.Celibataire());;
	System.out.println(ainer.A_des_enfants());;
	
		Fille2 cadette = new Fille2();
		
		cadette.Nom();
		cadette.Prenom();		
	System.out.println("elle a " + cadette.age() +"ans");
	cadette.profession();
	System.out.println(cadette.Celibataire());;
	System.out.println(cadette.A_des_enfants());;
	
	
		
		
	
	}
}