package exercice;




public class classe {
	
		private String prenom;
		private String nom;
		private int age;
		private String classe;

		public classe (String prenom, String nom,int age, String classe) {
			this.prenom = prenom;
			this.nom = nom;
			this.age = age;
			this.classe = classe;
		}	
		
		public String getNom() {
			return nom;
		}

		public void SePresenter() {
			System.out.println("son prénom est" + prenom + "mon nom est"+ nom + " mon age est de "+ age + "en classe de" + classe);
		}
		//Remplace l'id par le return de toString
		public String toString() {
			return nom + " " + classe;
		}
		
	}

