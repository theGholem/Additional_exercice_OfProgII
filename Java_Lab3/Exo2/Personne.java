
/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée des personnes ayant un nom et un age de facon tres generale.
 *          C'est la classe mere de "Etudiant" et "professeur", et c'est egalemt une abstract class.
 *          
 */
public abstract  class Personne{
   
    //Nos attributs

    protected String name;
    protected int old;

    //Public abstract methods

    /**
     * 
     * @return person's name
     */
   abstract String getName();

   /**
    * 
    * @return person's old
    */
   abstract int getOld();

   /**
    * display
    */
   abstract void display();

    
}