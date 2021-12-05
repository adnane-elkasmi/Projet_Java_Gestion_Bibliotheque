package Bibliotheque;

import java.sql.Date;

public class Application {

	public static void main(String[] args) {
		
		// Quelques instanciations pour tester l'application
		
		//Ajouter un auteur
		Livre sisyphe=new Livre("1","Les mathes en tetes","absurde du supplice de sysiphe",3,1);
		
		Auteur camus=new Auteur("Jean Sapert",20);
		
		sisyphe.addAuteur(camus);
		
		System.out.println(sisyphe.afficherAuteurs());
		
		
		//Ajouter un mot clé
		MotCle abs=new MotCle("Maths");
		
		abs.ajouterL(sisyphe);
		
		
		//Emprunter et supprimer un emprunt
		Exemplaire sisCam=new Exemplaire(1234,"1");
		
		Lecteur dze= new Lecteur("Djaouida Zaouche", 33, "dze@eisti.eu", Sanction.vert);
		Lecteur elkasmiadn = new Lecteur("Adnane EL KASMI", 17, "elkasmiadn@eisti.eu", Sanction.jaune);
		
		Emprunt empSisCam=new Emprunt(Date.valueOf("2020-05-12"), Date.valueOf("2020-05-15"), dze, sisCam);
		
		dze.emprunter(sisCam, Date.valueOf("2020-05-12"), Date.valueOf("2020-05-15"));
		
		System.out.println(dze.supprimerEmprunt(empSisCam));
		
		
		//Editer un livre
		Editeur gal=new Editeur("Ellipse");
		
		Edition galSisCam=new Edition(1942, 45, gal, sisyphe);
		
		gal.editer(galSisCam);
		
		System.out.println(gal.editions());
		
		System.out.println(Lecteur.afficherLecteurs());
	
		
		
		
	
	}

}
