public class Main {
	
	public static void main (String[] args){
	
	Pays[] mesPays;
	mesPays = new Pays[5];
	
	
	
	mesPays[0] = new Pays ("France","Français","paris","Euros", new Capitale("Paris", 5784, 4575));
	mesPays[1] = new Pays ("Bresil","Portuguais","brasilia","Euros", new Capitale("Brasilia", 4123, 1245));
	
	System.out.println(mesPays[0].toString());
	System.out.println(mesPays[1].toString());
	
	

	
	}
}
