package org.eclipse.model;

public class Etudiant extends Personne {

	private char niveau ;
	/// getter et setter//

	public char getNiveau() {
		return niveau;
	}

	public void setNiveau(char niveau) {
		this.niveau = niveau;
	}
	///// les constructeurs ///
	
	public Etudiant()
	{
		super();
	}

	public Etudiant(int num, String nom, String prenom,Adress ad,char niv)
	{
		super(num, nom, prenom,ad);
		this.niveau=niv;
		
	}
	public Etudiant(char niveau)
	{
		super();
		this.niveau= niveau;
	}
	
	public String toString() 
	{ 
		return super.toString()+ "[niveau=" + niveau + "]"; 

	}
	//////////////
	public void Affiche() {
		System.out.println("etudiant"+this.niveau);
		
	}
	
	
	
}
