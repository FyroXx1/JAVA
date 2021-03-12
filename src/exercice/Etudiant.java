package exercice;

import java.util.ArrayList;
import java.util.List;


public class Etudiant {
	
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private List<Etudiant> etudiants;

	    
		    public Etudiant(String nom,String prenom,int age,String classe) {
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.classe = classe;
			this.etudiants = new ArrayList<Etudiant>();
		}
		
		
		public void sePresenter() {
			System.out.println("les etudiants se presente");
			System.out.println("Bonjour je m'appelle " + nom +" "+ prenom + " et j'ai " + age + " ans, et je suis en " + classe);
			System.out.println(" ");
			
			for(int i = 0; i < etudiants.size(); i++){
			etudiants.get(i).sePresenter();
			}
			
		}

		public void AjouterunEtudiant(Etudiant etudiant) {
			etudiants.add(etudiant);
		}
		
		public void SupprimerunEtudiant(int etudiant) {
			etudiants.remove(etudiant);
		}
		
		
	}


