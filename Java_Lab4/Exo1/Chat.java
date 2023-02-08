
/**
 * @apiNote Classe concrete qui definit un chat, elle herite de Animal, donc beneficie de absolument toutes ses methodes
 * 
 * @author Konan
 * @since  25/01/2023
 */
public class Chat extends Animal {

	/**
	 * Chien class constructor
	 */
	public Chat(String name,String son) {
		super(name, son);
	}
	
	/**
	 * 
	 * @return le nom du chat
	 */
	public String getName() {
		return this.nom;
	}
	
	/**
	 * 
	 * @return le son du chat
	 */
	public String getSon() {
		return this.sing;
	}
}
