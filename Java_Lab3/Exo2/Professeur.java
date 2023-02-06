/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée un professeur ayant obligatoirement nos differentes
 *          methodes abstraites
 *          Professeur possede entre autre ses 2 propres attribut.
 *          C'est une classe fille de la classe abstraite Personne
 * 
 */
public class Professeur extends Personne{

    private String departement,cour;

    /**
     * professsor's constructor
     * 
     * @param name
     * @param old
     * @param departement
     * @param cour
     */
    public Professeur(String name, int old, String departement, String cour){
        this.name=name;
        this.old=old;

        this.departement=departement;
        this.cour=cour;
    }

    /**
     * 
     * @return Professor's name
     */
   public String getName(){
    return this.name;
   }

   /**
     * 
     * @return Professor's old
     */
   public int getOld(){
    return this.old;
   }

   /**
     * 
     * @apiNote cette methode affiche l'age et le nom, le departement, 
     *          et la le cour enseigné poour 'un professeur'
     */
   public void display(){
    System.out.println("Nom : "+this.name+"\nAge : "+this.old+" ans"+"\nDepartement de recherche : "+this.departement+"\nCour enseigné : "+this.cour+"\n");
   }
    
} 