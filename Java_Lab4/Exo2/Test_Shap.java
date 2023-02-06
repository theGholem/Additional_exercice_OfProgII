import java.util.Scanner;

public class Test_Shap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Creation d'un tableau à partir d'une classe abstraite
		
		TwoDimentionalShape[] form=new TwoDimentionalShape[3];
		TreeDimentionalShape[] form2=new TreeDimentionalShape[3];
		
		
		System.out.println("\n__RENSEIGNEMENTS: ___\n");
		System.out.println("Saisir le rayon de votre cercle svp");
		double rayonCercle=sc.nextDouble();
		System.out.println("Saisir un coté de votre carré svp");
		double coteCarre=sc.nextDouble();
		System.out.println("Saisir rspectivement la base et la hauteur  de votre triangle svp");
		double baseTriangle=sc.nextDouble();
		double hauteurTriangle=sc.nextDouble();
		System.out.println("Saisir le rayon de votre sphere svp");
		double rayonSphere=sc.nextDouble();
		System.out.println("Saisir un coté de votre cube svp");
		double coteCube=sc.nextDouble();
		System.out.println("Saisir une base de votre tetrahede svp");
		double baseTetrahed=sc.nextDouble();
		
		
		

		System.out.println("\n__Affichage de l'aire  de nos surface bidimentionnelle: ___\n");
		
		//instanciation de nos objet bidimentionelle a l'aide du polymorphisme
		
		form[0]=new Circle(rayonCercle,"Cercle");
		form[1]=new Square(coteCarre,"Carré");
		form[2]=new Triangle(baseTriangle,hauteurTriangle,"Triangle");
		
		for(int i=0;i<form.length;i++){
			
			  form[i].affichageBi();
		}
		
		System.out.println("\n__Affichage de l'aire et du volume de nos surface tridimentionnelle: ___\n");
		
		//instanciation de nos objet tridimentionelle a l'aide du polymorphisme
		
		form2[0]=new Sphere(rayonSphere,"Sphère");
		form2[1]=new Cube(coteCube,"Cube");
		form2[2]=new Tetrahedron(baseTetrahed,"Tétraède");
		
		
		for(int j=0;j<form2.length;j++) {
			
			form2[j].affichageTri();
		}
		
		
		
	}

}
