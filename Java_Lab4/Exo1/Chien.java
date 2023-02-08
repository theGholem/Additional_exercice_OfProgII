
/**
 * @apiNote Classe concrete qui definit un chien, elle herite de Animal, donc beneficie de absolument toutes ses methodes
 * 
 * @author Konan
 * @since  25/01/2023
 */
public class Chien extends Animal {
	
	/**
	 * Chien class constructor
	 */
	public Chien(String name,String son, String couleur, double longueur ) {
		super(name,son);
		this.couleur=couleur;
		this.longueur=longueur;
	}
	
	/**
	 * 
	 * @return le nom du chien
	 */
	public String getName() {
		return this.nom;
	}
	
	/**
	 * 
	 * @return le son de du chien
	 */
	public String getSon() {
		return this.sing;
	}

	/**
	 * 
	 * @return le nom de l'animal et sa couleur
	 */
	public String getColorChien() {
		return this.getColor();
	}

	/**
	 * 
	 * @return la longueur de l'animal
	 */
	public double getLength() {
		return this.getLength();
	}

	public void displayDog(){
		System.out.println("\nNOM: "+this.getName()+"\nSON: "+this.getSon()+"\nCOULEUR: "+this.getColor()+"\nLONGUEUR: "+this.getLenght()+" m");
	}

	
	
}
