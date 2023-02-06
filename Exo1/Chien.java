
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
	public Chien(String name,String son) {
		this.nom=name;
		this.sing=son;
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
	public String getColorChien(String color) {
		this.couleur=color;
		return "Nom : "+this.nom+"\nCouleur de "+this.nom+" : "+this.getColor();
	}
	
	/**
	 * @apiNote affiche le contenu de la methode getColorChien
	 */
	public void affichageChien() {
		System.out.println(getColorChien(this.couleur));
	}
}
