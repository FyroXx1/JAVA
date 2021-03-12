package exercice;

public class Tigre {
	private int taille;
	private String nom;
	private int age;
    private String race;
    
    
    public Tigre(int taille, String nom, int age, String race) {
    	this.taille = taille;
		this.nom = nom;
		this.age = age;
		this.race = race;
    	
    }
    
	public void SePresenter() {
		System.out.println("Salut, je me presente");
		System.out.println("Je mesure " + taille + " cm "+" mon age est de "+age +"ans"+ " mon nom est "+ nom + " et ma race est "+race);
	}

}
