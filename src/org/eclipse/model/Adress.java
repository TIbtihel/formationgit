package org.eclipse.model;

public class Adress {

	private int rue ;
	private String codepostal;
	private String ville;
	
///////les getters et les setters ///
	public int getRue() {
		return rue;
	}
	public void setRue(int rue) {
		this.rue = rue;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
///////les constructeur///
	public Adress() 
	{
		super();
	}
	
	public Adress(int rue, String codepostal, String ville)
	{
		super();
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}
/////// la surcharge /////
	public String toString() 
	{ 
		
		return "adress:["+rue+" "+ville+" "+codepostal+"]";
	}

}
