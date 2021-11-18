package fr.omega.projet1;

public class Fille1 extends Mere implements Marier {

	public Fille1() {
		super("ainer");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Nom() {
		System.out.println("Son nom est AGBO");
		

	}

	@Override
	public void Prenom() {
		System.out.println("Son prénom est Angèle");
	}

	@Override
	public int age() {
		
		return 25;
	}

	@Override
	public void profession() {
		System.out.println("Elle est expert comptable");
	}

	@Override
	public boolean Celibataire() {
		
		return false;
	}

	@Override
	public String A_des_enfants() {
		
		return "oui" ;
	}

}
