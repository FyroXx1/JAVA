package exercice;

import java.util.ArrayList;
import java.util.List;



public class Main {
	
	public static void main(String[] args) {

        
		Tigre newTigre = new Tigre(250,"Tigrou",8,"Bengale");
		
        Etudiant newEtudiant = new Etudiant("Anthony","GATEL",18,"BTS SIO 1");

        Etudiant newEtudiant2 = new Etudiant("Benjamin","DROUIN",18,"BTS SIO 1");
        

        //Créer une liste de type étudiant 
        List<Etudiant> etudiant = new ArrayList<Etudiant>();
        
        //Ajoute un etudiant a la classe 
        etudiant.add(newEtudiant);
        etudiant.add(newEtudiant2);
        Etudiant newEtudiants = new Etudiant("Ewen","Herve",18,"BTS SIO 1");
        
        //Ajout de chien a l'Etudiant
        newEtudiant.AjouterunEtudiant(newEtudiant);
        newEtudiant.AjouterunEtudiant(newEtudiant2);
        newEtudiant.AjouterunEtudiant(newEtudiants);
        newEtudiant.SupprimerunEtudiant(0);
        System.out.println("Présentation des élèves de la classe");
        
        // Lecture de tous les élèves
        	
        newEtudiant.sePresenter();
        newTigre.SePresenter();
        }
	}