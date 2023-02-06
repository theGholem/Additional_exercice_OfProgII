
public class Square extends TwoDimentionalShape {

	private String name;
	
	/*
	 * Square class constructor
	 */
	public Square(double cote,String name) {
		this.coteSquare=cote;
		this.name=name;
	}
	
	/**
	 * 
	 * @return l'aire du carré (surface bidimentionnelle)
	 */
	public double getArea() {
		
		return this.coteSquare*this.coteSquare;
		
	}
	
	public void affichageBi() {
		System.out.println("\n"+this.name+" : "+getArea()+" m²");
	}
	
}
