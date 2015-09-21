public class Capitale {
	
	private String nom;
	private int nbhab;
	private int superficie;
	
	public Capitale(){
		
		}
	
	public Capitale(String unNom, int unNbhab, int uneSuperficie){
		this.nom=unNom;
		this.nbhab=unNbhab;
		this.superficie=uneSuperficie;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbhab() {
		return this.nbhab;
	}

	public void setNbhab(int nbhab) {
		this.nbhab = nbhab;
	}

	public int getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String toString() {
		return  nom + ", nbhab=" + nbhab + ", superficie="
				+ superficie + " KM";
	}

	
	
}
