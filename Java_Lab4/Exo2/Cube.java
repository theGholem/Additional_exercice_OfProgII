public class Cube extends TreeDimentionalShape {

	private String name;
	
	/*
	 * Sphere class constructor
	 */
	public Cube(double coteCube, String name) {
		this.coteSquareOfCube=coteCube;
		this.name=name;
	}
	
	/**
	 * 
	 * @apiNote aire cube=6*(C*C)
	 *          volume cube = C*C*C
	 * 
	 * @return l'aire de la surface tridimentionnelle
	 */
	public double getArea() {
		return 6*(this.coteSquareOfCube*this.coteSquareOfCube);
	}
	
	/**
	 * 
	 * @return le volume d'un cube (surface tridimentionnelle)
	 */
	public double getVolume() {
		
		return this.coteSquareOfCube*this.coteSquareOfCube*this.coteSquareOfCube;
	}
	
	public void affichageTri() {
		System.out.println("\n"+this.name+" \nAire: "+getArea()+" m²"+"\nVolume: "+this.getVolume()+" m³");
	}
	
}
