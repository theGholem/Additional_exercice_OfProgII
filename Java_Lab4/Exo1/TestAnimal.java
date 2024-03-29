import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;

/**
 * @apiNote cette classe test nos objets. On va créer ici 5 objets, 2chats, 2 chiens et un autre chien 
 * 
 * @author Konan
 * @since  25/01/2023
 */
public class TestAnimal {

	public static void main(String[] args)throws Exception {
		
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try{

			//Nos objets
		Chat cat1,cat2;
		Chien dog1,dog2;
		
		//Section de saisi du User concernant nos chats
		System.out.println("\n___Information relative à nos deux chats___\n");
		System.out.println("Saisir le nom du premier chat svp");
		String n1=br.readLine();
		System.out.println("Saisir son bruit maintenant svp");
		String s1=br.readLine();
		
		System.out.println("\nSaisir le nom du deuxieme chat svp");
		String n2=br.readLine();
		System.out.println("Saisir son bruit maintenant svp");
		String s2=br.readLine();
		
		
		//instanciation par polymorphisme de nos chats
		
		ArrayList<Chat> group1=new ArrayList<Chat>(10);
		
		group1.add(new Chat(n1,s1));
		group1.add(new Chat(n2,s2));
		
		System.out.println();
		
		//Section de saisi du User concernant nos chiens
		System.out.println("___Information relative à nos deux chiens___\n");
		System.out.println("Saisir le nom du premier chien svp");
		String n3=br.readLine();
		System.out.println("Saisir son bruit maintenant svp");
		String s3=br.readLine();
		System.out.println("\nSaisir la couleur du premier chien svp");
		String c3=br.readLine();
		System.out.println("Saisir sa longueur maintenant svp");
		double l3=sc.nextDouble();
		
		System.out.println("\nSaisir le nom du deuxieme chien svp");
		String n4=br.readLine();
		System.out.println("Saisir son bruit maintenant svp");
		String s4=br.readLine();
		System.out.println("\nSaisir la couleur du deuxieme chien svp");
		String c4=br.readLine();
		System.out.println("Saisir sa longueur maintenant svp");
		double l4=sc.nextDouble();
		
		
		//instanciation par polymorphisme de nos chients
		
		ArrayList<Chien> group2=new ArrayList<Chien>(10);
		
		group2.add(new Chien(n3,s3,c3,l3));
		group2.add(new Chien(n4,s4,c4,l4));
		
		
		//execution de nos methode maintenant
		
		System.out.println("\n\n___Nos deux chats: ___\n\nNOM:");
		
		ListIterator<Chat> it1=group1.listIterator();
		while(it1.hasNext())
			System.out.println(it1.next().getName());
			
		System.out.println("\nSON:");
		ListIterator<Chat> it2=group1.listIterator();
		while(it2.hasNext())
			System.out.println(it2.next().getSon());
		
		System.out.println("\n\n___Nos deux chiens: ___\n\nNOM:");
		
		ListIterator<Chien> it3=group2.listIterator();
		while(it3.hasNext())
			System.out.println(it3.next().getName());
			
		System.out.println("\nSON:");
		ListIterator<Chien> it4=group2.listIterator();
		while(it4.hasNext())
			System.out.println(it4.next().getSon());

		System.out.println("\nCOULEUR:");
		ListIterator<Chien> it5=group2.listIterator();
		while(it5.hasNext())
			it5.next().displayDog();;

		System.out.println("\nLONGUEUR:");
		ListIterator<Chien> it6=group2.listIterator();
		while(it6.hasNext())
			it6.next().displayDog();;
		
		

		}catch(InputMismatchException e){
			System.out.println("Veuillez bien lire les questions svp");
		}
		
		
		
	
	}

}
