package fr.omega.projet1;

public class Fille2 extends Mere implements Marier {

	public Fille2() {
		super("cadette");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Nom() {
		System.out.println("Son nom est AGBO");
	}

	@Override
	public void Prenom() {
		System.out.println("Son prénom est Eveline");
	}

	@Override
	public int age() {
		return 22;
	}

	@Override
	public void profession() {
		System.out.println("Elle est développeur web");
	}

	@Override
	public boolean Celibataire() {

		return true;
	}

	@Override
	public String A_des_enfants() {

		return "non";
	}

}
