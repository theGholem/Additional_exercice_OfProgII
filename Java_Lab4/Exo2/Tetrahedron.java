public class Tetrahedron extends TreeDimentionalShape {

	private String name;
	 
	/*
	 * Sphere class constructor
	 */
	public Tetrahedron(double baseTetrahed, String name) {
		this.baseTriangleOfTetrahed=baseTetrahed;
		this.name=name;
	}
	
	/**
	 * 
	 * @apiNote aire tetrahedron=Racine(3)*base*base
	 *          volume tetrahedron= (racine(2)/12)*base*base*base
	 * 
	 * @return l'aire de la surface tridimentionnelle
	 */
	public double getArea() {
		return Math.sqrt(3)*this.baseTriangleOfTetrahed;
	}
	
	/**
	 * 
	 * @return le volume d'un cube (surface tridimentionnelle)
	 */
	public double getVolume() {
		
		return (Math.sqrt(2)/12)*this.baseTriangleOfTetrahed;
	}
	
	public void affichageTri() {
		System.out.println("\n"+this.name+" \nAire: "+getArea()+" m²"+"\nVolume: "+this.getVolume()+" m³");
	}
}
