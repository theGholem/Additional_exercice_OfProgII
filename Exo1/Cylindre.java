/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée un cylindre en ayant pour base un cercle
 */
public class Cylindre{

    Cercle base; //type natif
    private double hauteur;

    /**
     * 
     * Constructor by default
     */
    public Cylindre(){

    }

    /**
     * @apiNote constructor with parameters
     * 
     * @param b
     * @param h
     */
    public Cylindre(Cercle b,double h){

        this.base=this.base;
        this.hauteur=this.hauteur;
    }

    /**
     * 
     * @return labase du cercle associé
     */
    public Cercle getBase(){
        return this.base;
    }

    /**
     * 
     * @return la hauteur du cylindre
     */
    public double getHauteur(){
        return this.hauteur;
    }

    /**
     * 
     * @param B
     * 
     * @apiNote modifie la base du cylindre
     */
    public void setBase(Cercle B){
        this.base=B;
    }

    /**
     * 
     * @param H
     * 
     * @apiNote modifie la hauteur du cylindre
     */
    public void setHauteur(double H){
        this.hauteur=H;
    }

    /**
     * 
     * @return un cercle qui represente la base du cylindre
     */
   public Cercle surfaceCylindre(){
        return this.getBase(); //la surface du cylindre n'est rien d'autre que la base du cercle;
   }

   /**
    *
    *@apiNote  En effet, "base" constitue à lui tout seul un cercle, alors en appelant une methode propre au cercle,
    *          on peut utiliser toutes les methode de la classe "Cercle"
    *
    *             "base.getRayon()" -->on appel le rayon du cercle du cercle base
    *             "base.surfaceCercle()" -->on appel la surface du cercle base
    *             "base.diametreCercle()"-->on appel le diametre de base 
    *
    * @return la surface du cercle de la base du cylindre appelé "base"
    */
   public double volumeCylindre(){

        /* return Math.PI*this.base.getRayon()*this.base.getRayon()*this.hauteur; */
        
        return this.base.surfaceCercle()*this.hauteur;
   }

   /**
    * @return les information relatives au cylindre, à savoir sa surface et son volume
    */
   public String toString(){

        String rst="Surface base du cylindre : "+this.surfaceCylindre().surfaceCercle()+" m²\nVolume cylindre : "+this.volumeCylindre()+" m3\n";
        return rst;
   }

   public void displayCylindre(){
        System.out.println(toString());
   }
}