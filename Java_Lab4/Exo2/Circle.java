public class Circle extends TwoDimentionalShape {
	
	private String name;
	
	/*
	 * Circle class constructor
	 */
	public Circle(double rayon, String name ) {
		this.rayonCircle=rayon;
		this.name=name;
	}
	
	/**
	 * 
	 * @return l'aire du cercle (surface bidimentionnelle)
	 */
	public double getArea() {
		
		return Math.PI*this.rayonCircle*this.rayonCircle;
		
	}
	
	public void affichageBi() {
		System.out.println("\n"+this.name+" : "+getArea()+" m²");
	}

}
