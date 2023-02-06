
/**
 * 
 * @apiNote Creation de notre classe mere Animal
 * 
 * @author Konan
 * @since  25/01/2023
 */
abstract public class Animal {

	protected String nom,couleur,sing;
	protected double longueur;
	
	
	/**
	 * 
	 * @return la couleur de l'animal
	 */
	public String getColor() {
		return this.couleur;
	}
	
	/**
	 * 
	 * @return la longueur de l'animal;
	 */
	public double getLenght() {
		return this.longueur;
	}
	
	/**
	 * @apiNote cette methode est abstraite
	 * 
	 * @return le nom de notre animal
	 */
	abstract public String getName();
	
	/**
	 * 
	 * @apiNote cette methode est abstraite
	 * 
	 * @return le son que fait l'animal
	 */
	abstract public String getSon();
	
}
