
public class Sphere extends TreeDimentionalShape {

	private String name;


	/*
	 * Sphere class constructor
	 */
	public Sphere(double rayonSphere,String name) {
		this.rayonCircleOfSphere=rayonSphere;
		this.name=name;
	}
	
	/**
	 * @apiNote aire sphere=4*PI*r*r
	 *          volume sphere= 4/3*P*r*r*rI
	 * 
	 * @return l'aire de la surface tridimentionnelle
	 */
	public double getArea() {
		return 4*Math.PI*this.rayonCircleOfSphere*this.rayonCircleOfSphere;
	}
	
	/**
	 * 
	 * @return le volume d'une sphere (surface tridimentionnelle)
	 */
	public double getVolume() {
		
		return (4/3)*Math.PI*this.rayonCircleOfSphere;
	}
	
	public void affichageTri() {
		System.out.println("\n"+this.name+" \nAire: "+getArea()+" m²"+"\nVolume: "+this.getVolume()+" m³");
	}
	
}
