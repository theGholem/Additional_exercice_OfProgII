/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée un etudiant ayant obligatoirement nos differentes
 *          methodes abstraites issue de la classe "Persone"
 *          Etudiant possede entre autre ses 2 propres attribut.
 *          C'est une classe fille de la classe abstraite Personne
 * 
 */
public class Etudiant extends Personne{

    private int nbreOfCourse;
    private String carriere;

    /**
     * 
     * Etudiant's constructor
     * 
     * @param name
     * @param old
     * @param nbreOfCourse
     * @param carriere
     */
    public Etudiant(String name, int old, int nbreOfCourse, String carriere){
        this.name=name;
        this.old=old;

        this.nbreOfCourse=nbreOfCourse;
        this.carriere=carriere;
    }
    /**
     * 
     * @return Etudiant's name
     */
   public String getName(){
    return this.name;
   }

    /**
     * 
     * @return Etudiant's old
     */
   public int getOld(){
    return this.old;
   }


    /**
     * 
     * @apiNote cette methode affiche l'age et le nom, le nombre de cour, 
     *          et la carriere pour 'un etudiant'
     */
    public void display(){
        System.out.println("Nom : "+this.name+"\nAge : "+this.old+" ans"+"\nNombre de cour : "+this.nbreOfCourse+"\nCarriere : "+this.carriere+"\n");
    }

}