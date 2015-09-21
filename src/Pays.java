public class Pays {
	
	//Creation des classes privées
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	private static int compteurPays=0;
	private Capitale macapitale;
	
	private Ville[] mesVilles;
	private int MaxNbrVille=5;
	
	private int compteurVille; 
	
	//Constructeur par defaut
	public Pays(){
		this.mesVilles = new Ville[this.MaxNbrVille];
		this.compteurVille = 0;
		this.compteurPays++;
	}
	
	//Instanciation des paramètres
	public Pays(String unNom, String uneLangue, String uneMonnaie, String uneCapitale, Capitale maCapitale){
		this.nom=unNom;
		this.langue=uneLangue;
		this.monnaie=uneMonnaie;
		this.capitale=uneCapitale;
		this.compteurVille = 0;
		this.compteurPays=compteurPays+1;
		this.macapitale=maCapitale;
	}
	
	public int getMaxNbrVille() {
		return MaxNbrVille;
	}

	public void setMaxNbrVille(int maxNbrVille) {
		MaxNbrVille = maxNbrVille;
	}
	public Ville[] getMesVilles() {
		return mesVilles;
	}
	public void setMesVilles(Ville[] mesVilles) {
		this.mesVilles = mesVilles;
	}
	public int getCompteurVille() {
		return compteurVille;
	}
	public void setCompteurVille(int compteurVille) {
		this.compteurVille = compteurVille;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLangue() {
		return this.langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getMonnaie() {
		return this.monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

	public String getCapitale() {
		return this.capitale;
	}

	/*public void setCapitale(String capitale) {
		this.capitale = capitale;
	}*/
	
	public int getCompteurPays(){
		return this.compteurPays;
	}
	
	public void setCompteurPays(int compteurPays){
		this.compteurPays= compteurPays;
	}
	
	public Capitale macapitale(){
		return this.macapitale;
	}
	
	public void macapitale(Capitale macapitale){
		this.macapitale= macapitale;
	}
	
	public Ville afficheUneVille(int i){
		Ville val = null;
		if(i<this.compteurVille && i>=0){
			val = mesVilles[i];
		}
		return val;
	}
	/**
	 * @param level
	 */
	public void ajoutVille(Ville uneVille){
		if(this.compteurVille<this.MaxNbrVille){//verification que le compteur na dÃ©pace pas le nombre de case 
			this.mesVilles[this.compteurVille] = uneVille;
			this.compteurVille++;
		}
	}

	public String toString() {
		String chaine="________________________________________________\n";
		chaine+="nom: "+this.getNom()+"\n";
		chaine+="langue: "+this.getLangue()+"\n";
		chaine+="monnaie: "+this.getMonnaie()+"\n";
		chaine+="capital: "+this.getCapitale()+"\n";
		if(this.macapitale!=null){
			chaine+="<--Capital-->\n";
			chaine+=this.macapitale.toString()+"\n";
		}else{
			chaine+="<--Capital-->\n";
			chaine+="===>inconnue\n\n";
		}
		for(int i=0;i<this.compteurVille;i++){
			chaine+="<--Ville-->\n";
			chaine+=this.afficheUneVille(i).toString()+"\n";
		}
		
		return chaine+"\n";
	}

	public String nomMaj(){
		String nomMaj = getNom().toUpperCase();
		return nomMaj;
	}
	
	public String nomMin(){
		String nomMin = getNom().toLowerCase();
		//nomMin = nomMin.toUpperCase().charAt(0);
		return nomMin;
	}
	
	public String FirstCaps(){
		  String caps;
		  String cops;
		  String ceps;
		  cops = "";
		  ceps = this.getNom();
		  caps = this.getNom().substring (0,1).toUpperCase();
		  cops = this.getNom().substring (1,ceps.length());
		 
		  
		  return caps + cops;
		  
	 }
	
}
	

