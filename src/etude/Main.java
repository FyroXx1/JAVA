package etude;

import java.util.ArrayList;
import java.util.List;



public class Main{

	public static void main(String[] args) {

        
 
        Chien newChien = new Chien(40,5,"cookie","bouldog");

        Chien newChien2 = new Chien(55,8,"Gizmo","Lhassa-apso");
        

        //Crée une liste de type chien 
        List<Chien> chien = new ArrayList<Chien>();
        
        //Ajoute un chien au chenil 
        chien.add(newChien);
        chien.add(newChien2);
        Etudiant newEtudiant = new Etudiant("Gatel","Anthony",18,"BTS SIO 1");
        
        //Ajout de chien a l'Etudiant
        newEtudiant.AjouterunChien(newChien);
        newEtudiant.AjouterunChien(newChien2);
        newEtudiant.SupprimerunChien(0);
        System.out.println("Les chiens de l'Etudiant et lui meme se presente");
        
        // Lecture de tous les noms des chiens
        	
        newEtudiant.sePresenters();
        
        }
	}

/*public class Main {
	public static void main(String[] args) {
		int maVar=8;
		int maVar2=12;
		
		String maChaine = new String ("Salut les copains !");
		
		MaClasse monObj = new MaClasse(8);
		MaClasse monObj2 = new MaClasse(12);
		
		
		System.out.println(maVar+maVar2); // systeme.out.println = console.log
		System.out.println(maChaine);// systeme.out.println = console.log
		System.out.println(monObj.compteur);
		System.out.println(monObj2.compteur);
		
	   
   }
}

*/