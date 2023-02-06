/**
 * 
 * @author oem
 * @since  30/01/2023
 */
public class TestFigure{
    public static void main(String[]args){

        Point point1,point2;
        Cercle cercle1;
        Cylindre cylindre1;

        point1=new Point();
        point2=new Point();
        cercle1=new Cercle();
        cylindre1=new Cylindre();

        //Information relative aux points:

        System.out.println("\n___Info point: ___\n");
        point1.setX(5);
        point1.setY(3.3);
        point1.displayPoint();

        point2.setX(7);
        point2.setY(6.8);

         //Information relative aux cercles:

         System.out.println("\n___Info cercle: ___\n");
         cercle1.setPoint(point2); //on peut aussi créer d'autres points, ou utiliser "point1"...
         cercle1.setRayon(9);
         cercle1.displayCircle();

         //Information relative aux cylindres:

         System.out.println("\n___Info cylindre: ___\n");
         cylindre1.setBase(cercle1);
         cylindre1.setHauteur(14.5);
         cylindre1.displayCylindre();
    }
}