import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.ListIterator;

import java.io.InputStreamReader;
import java.io.BufferedReader;




/**
 * 
 * @author oem
 * @since  30/01/2023
 * 
 * @apiNote cette classe est notre classe test.
 *          On crée un tableaux de notre classe abstraite "Personne" et ainsi on peut afficher les resultats 
 *          de ses composantes, c-a-d "Etudiant & Professeur"  souhaité.
 *         
 */
public class TestPerson{
    public static void main(String[]args) throws Exception{



        Scanner sc=new Scanner(System.in);

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        //Mes variable

        String n1="null",n2="null",n3="null",n4="null";
        String dp2="null",dp4=null;
        String c1="null",c2="null",c3="null",c4="null";
        int o1=0,o2=0,o3=0,o4=0;
        int nbc1=0,nbc3=0;
        
        try{


            System.out.println("\n___RENSEIGNEMENTS ETUDIANTS ET PROFESSEURS : \n");

            //1ere personne
    
            System.out.println("\nPremier personne.\n\nBonjour et bienvenue.\nEtes vous etudiant?");
    
           
    
                Boolean rps1=sc.nextBoolean();
                if(rps1==true){
                    System.out.println("Saisir votre nom complet svp");
                    n1=br.readLine();
                    System.out.println("Saisir votre age");
                    o1=sc.nextInt();
                    System.out.println("Saisir votre nombre de cour svp");
                    nbc1=sc.nextInt();
                    System.out.println("Saisir votre la carriere que vous envisagé svp");
                    c1=br.readLine();
                }else{ 
                    System.out.println("Saisir votre nom complet svp");
                    n2=br.readLine();
                    System.out.println("Saisir votre age");
                    o2=sc.nextInt();
                    System.out.println("Saisir votre departement de recherche svp");
                    dp2=br.readLine();
                    System.out.println("Saisir le cour que vous enseigné svp");
                    c2=br.readLine();
                }
    
            
    
            //2eme personne
    
            System.out.println("\n2eme personne.\n\nBonjour et bienvenue.\nEtes vous etudiant?");
           
           
    
                Boolean rps2=sc.nextBoolean();
                if(rps2==true){
                    System.out.println("Saisir votre nom complet svp");
                    n3=br.readLine();
                    System.out.println("Saisir votre age");
                    o3=sc.nextInt();
                    System.out.println("Saisir votre nombre de cour svp");
                    nbc3=sc.nextInt();
                    System.out.println("Saisir votre la carriere que vous envisagé svp");
                    c3=br.readLine();
                }else{
                    System.out.println("Saisir votre nom complet svp");
                    n4=br.readLine();
                    System.out.println("Saisir votre age");
                    o4=sc.nextInt();
                    System.out.println("Saisir votre departement de recherche svp");
                    dp4=br.readLine();
                    System.out.println("Saisir le cour que vous enseigné svp");
                    c4=br.readLine();
                }
    
            
    
           
            ArrayList<Personne> group=new ArrayList<Personne>(5);
    
            System.out.println("\n__Informations : ___\n");
    
            group.add(new Etudiant(n1, o1, nbc1, c1));
            group.add(new Professeur(n2,o2,dp2,c2));
            group.add(new Etudiant(n3, o3, nbc3, c3));
            group.add(new Professeur(n4,o4,dp4,c4));
           
            
    
    
            group.add(new Etudiant("Olivier",19,4, "Mathematicien"));
            group.add(new Professeur("Juliette",27,"Art&Music", "Partition"));
            group.add(new Etudiant("Philipé",23,5, "Educateur"));
    
            ListIterator<Personne> li=group.listIterator();
            while(li.hasNext())
                li.next().display();
    
          

        }catch(InputMismatchException e){

            System.out.println("\nVous devez saisir true or false pour vrai ou faux.\nMerci de réeesayer ulterieurement\n");

        }
  

    }
}