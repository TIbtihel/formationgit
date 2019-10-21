package org.eclipse.model;

public class Personne {
	private int num;
	private String nom;
	private String prenom;
	private Adress ad;
////constructeur 1 ////
	public Personne()
	{
		super();
	}
//// constructeur 2 ////
	public Personne(int num, String nom, String prenom) 
	{
		super();
		if (num >= 1)
		{
			this.num = num; 
		}
		else
		{
			System.out.println("identifiant nn valide");
		}
		this.nom = nom;
		this.prenom = prenom;
	}
	public Personne(int num, String nom, String prenom,Adress ad) 
	{
		super();
		if (num >= 1)
		{
			this.num = num; 
		}
		else
		{
			System.out.println("identifiant nn valide");
		}
		this.nom = nom;
		this.prenom = prenom;
		this.ad=ad;
	}
    ////// surcharge //////
	public String toString() 
	{ 
		return "Personne [num= " + num + ", nom= " + nom + ", prenom= " + prenom + "]"+ ad;
	}
	//// getter and setter///
	public int getNum() {
		
		return num;
	}
	public void setNum(int num) 
	{
		
		if (num >= 1)
		{
			this.num = num; 
		}
		else
		{
			System.out.println("identifiant nn valide");
		}
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	public Adress getAd()
	{
		return ad;
	}
	public void setAd(Adress ad) 
	{
		this.ad = ad;
	}
	
	//////// surcharge //////
	public void Affiche()
	{
		
	}

}
