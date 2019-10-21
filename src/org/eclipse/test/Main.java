package org.eclipse.test;

import org.eclipse.model.Adress;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;


public class Main {

	public static void main(String[] args) {

		Personne P = new Personne();
		P.setNom("khemir");
		P.setPrenom("ibtihel");
		P.setNum(1);
		P.setAd(new Adress(1,"foch","paris"));
		Adress ad=new Adress(6,"clobert","versailles");
		Personne P1 = new Personne();
		P1.setNom("khemir");
		P1.setPrenom("jed");
		P1.setNum(2);
		Personne P2 = new Personne(1,"khemir","raycen",ad);
		System.out.println(P2);
		System.out.println(P);
		System.out.println();
		System.out.println(P.getNum() + ", " + P. getNom() + ", " + P.getPrenom());
		System.out.println();
		///// les classe enseignat et etudiant //////
		Enseignant ens = new Enseignant(); 
		ens.setNum(3); 
		ens.setNom("green"); 
		ens.setPrenom("jonas"); 
		ens.setSalaire(1700); 
		ens.setAd(ad);
		System.out.println(ens);
		Personne ens1 = new Enseignant(3,"green"," jonas",ad,1700);
		System.out.println(ens1);
		///////////// instance of ///////
		Personne enseignant = new Enseignant(3, "green", " jonas", ad,1700); 
		System.out.println(enseignant instanceof Enseignant) ; 
//// manipulation de tableau de personne/////
		Enseignant ens4 = new Enseignant(3,"green"," jonas",ad,1600);
		Enseignant ens5 = new Enseignant(4,"barbara"," joel",ad,1500);
		Etudiant etu4 = new Etudiant(3,"doug"," merise",ad,'m');
		Etudiant etu5 = new Etudiant(4,"sabrina","math",ad,'b');
		System.out.println(ens4);
		System.out.println(ens5);
		System.out.println(etu5);
		System.out.println(etu4);
		System.out.println();
		System.out.println("***********************************");
		System.out.println("affichage d'un tableau de personne ");
		System.out.println("***********************************");
		System.out.println();
		
		Personne personnes [] = {ens4, ens5, etu4,etu5};
		for(Personne perso : personnes) 
		{ 
			if (perso instanceof Etudiant)
			{
				((Etudiant) perso).getNiveau();
				System.out.println("****************************");
				System.out.println("la personne est un etudiant");
				perso.Affiche();
				
			}
			else 
			{
				((Enseignant) perso).getSalaire();
				System.out.println("****************************");
				System.out.println("la personne est un eneignant");
				perso.Affiche();
			}
			
		}
		
		
		for(Personne perso : personnes) 
		{ 
			System.out.println(perso); 
		}

		
	}

}
