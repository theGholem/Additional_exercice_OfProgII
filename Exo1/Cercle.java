/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe crée un cercle à l'aide d'un point centre et un rayon
 * 
 */
public class Cercle{

    Point centre; //type natif 
    private double rayon;

    /**
     * 
     * Constructor by default
     */
    public Cercle(){

    }

    /**
     * 
     * @apiNote constructor with parameters
     * 
     * @param o
     * @param r
     */
    public Cercle(Point o,double r){

        this.centre=o;
        this.rayon=r;
    }

    /**
     * 
     * @return le point centre du cercle
     */
    public Point getPoint(){

        return this.centre;
    }

    /**
     * 
     * @return le rayon du cercle
     */
    public double getRayon(){

        return this.rayon;
    }

    /**
     * 
     * @param O
     * 
     * @apiNote modifie le point centre du cercle
     */
    public void setPoint(Point O){
        this.centre=O;
    }

    /**
     * 
     * @param R
     * @apiNote modifie le rayon du cercle
     */
    public void setRayon(double R){
        this.rayon=R;
    }

    /**
     * 
     * @return la surface du cercle
     */
    public double surfaceCercle(){

        double rst=Math.PI*this.rayon*this.rayon;
        return rst;
    }

    /**
     * 
     * @return le diametre du cercle
     */
    public double diametreCercle(){

        double rst=2*this.rayon;
        return rst;
    }

    /**
     * 
     * @return les information relatives au cercle, à savoir son diametre et sa surface
     */
    public String toString(){

        String rst="Diametre : "+this.diametreCercle()+" m\nSurface : "+this.surfaceCercle()+" m²\n";
        return rst;
    }

    public void displayCircle(){
        System.out.println(this.toString());
    }
}