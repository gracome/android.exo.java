package fr.omega.projet1;

public abstract class Mere {
	public abstract void Nom();
	public abstract void Prenom();
	public abstract int age();
	public abstract void profession();

	
	private String name;
	
	public Mere(String name) {
		this.name = name;
		
	
}

}