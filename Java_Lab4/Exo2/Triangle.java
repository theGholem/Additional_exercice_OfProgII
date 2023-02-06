public class Triangle extends TwoDimentionalShape {

	private String name;

	/*
	 * Triangle class constructor
	 */
	public Triangle(double base, double hauteur, String name) {
		this.baseTriangle=base;
		this.hauteurTriangle=hauteur;
		this.name=name;
	}
	
	
	/**
	 * 
	 * @return l'aire du triange (surface bidimentionnelle)
	 */
	public double getArea() {
		
		return (this.baseTriangle*this.hauteurTriangle)/2;
		
	}
	
	public void affichageBi() {
		System.out.println("\n"+this.name+" : "+getArea()+" m²");
	}
}
