package etude;

import java.util.ArrayList;
import java.util.List;

import exercice.Etudiant;
import exercice.Etudiant;

public class Etudiant {

	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private List<Chien> chiens;
	private List<Etudiant> etudiants;

  
	
	    
	    
	    public Etudiant(String prenom,String nom,int age,String classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.etudiants = new ArrayList<Etudiant>();
	}

	
		public void sePresenters() {
			System.out.println("les etudiants se presente");
			System.out.println("Bonjour je m'appelle " + prenom +" "+ nom + " et j'ai " + age + " ans, et je suis en " + classe);
			System.out.println(" ");
			
			for(int i = 0; i < etudiants.size(); i++){
			etudiants.get(i).sePresenters();
			}
			
	}

	public void AjouterunChien(Chien chien) {
		chiens.add(chien);
	}
	
	public void SupprimerunChien(int chien) {
		chiens.remove(chien);
	}
	
	public void AjouterunEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
	
	public void SupprimerunEtudiant(int etudiant) {
		etudiants.remove(etudiant);
	}
}
