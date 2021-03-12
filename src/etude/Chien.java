package etude;


public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;

	public Chien(int taille, int age,String nom, String race, String prenom, String classe) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
		this.prenom = prenom;
		this.classe = classe;
	}	
	
	public String getNom() {
		return nom;
	}

	public void SePresenter() {
		System.out.println("Je mesure " + taille + " cm "+" mon age est de "+age +"ans"+ " mon nom est "+ nom + " et ma race est "+race);
	}
	
	public void SePresenters() {
		System.out.println("son prénom est" + prenom + "mon nom est"+ nom + " mon age est de "+ age + "en classe de" + classe);
	}
	//Remplace l'id par le return de toString
	public String toString() {
		return nom + " " + race;
	}
	
}
