package org.eclipse.model;

public class Enseignant extends Personne 
{
	private int salaire;
	
//// les getter et les setters////
	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	///// les constructeurs/////
	
	public Enseignant(int salaire) 
	{
		super();
		this.salaire = salaire;
	}
	//
	public Enseignant()
	{
		super();
	}

	public Enseignant(int num, String nom, String prenom,Adress ad,int salaire) 
	{
		super(num, nom, prenom,ad);
		this.salaire=salaire;
	}
	
	/////// surcharge //////
	public String toString() 
	{ 
		return super.toString()+ "[salaire=" + salaire + "]"; 

	}

	@Override
	public void Affiche() {
		System.out.println("enseignant"+this.salaire);
		
	}
	
	
	

}
