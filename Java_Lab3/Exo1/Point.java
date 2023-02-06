/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée un point de coordonnée X et Y
 * 
 */
public class Point {

    private double abscisse,ordonne;

    /**
     * 
     * @apiNote constructor par defaut
     */
    public Point(){

    }

    /**
     * Constructor with parameters
     * 
     * @param x
     * @param y
     */
    public Point(double x,double y){

        this.abscisse=x;
        this.ordonne=y;
    }

    /**
     * 
     * @return abscisse du point
     */
    public double getX(){
        return this.abscisse;
    }
    
    /**
     * 
     * @return ordonné du point
     */
    public double getY(){
        return this.ordonne;
    }

    /**
     * 
     * @param X
     * 
     * @apiNote modifie la valeur de l'abscisse X
     */
    public void setX(double X){
        this.abscisse=X;
    }

    /**
     * 
     * @param Y
     * 
     * @apiNote modifie la valeur de l'ordonné Y
     */
    public void setY(double Y){
        this.ordonne=Y;
    }

    /**
     * 
     * @return toString()
     * 
     *@apiNote retourne les informations relative aux coordonnées X et Y du point
     */
    public String toString(){

        String rst="Coordonnées : ( "+this.getX()+" ; "+this.getY()+" )";
        return rst;
    }

    public void displayPoint(){
        System.out.println(this.toString());
    }
  
}