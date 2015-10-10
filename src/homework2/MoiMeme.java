/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import static homework2.Personne.amis;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class MoiMeme {
    static String nom;
    static String prenom;
    static int age;
    static String nationalite;
     static int choix ;
    static String choice;
    static Personne p=new Personne();
    static Personne person= new Personne();
    
    static Scanner clavier=new Scanner(System.in);
    public static void utilisateur(){
        System.out.println("***Bienvenue Sur Notre Espace Amis***");
        System.out.println("\n1-Inscription");
         System.out.println("\n2-Ajouter un ami");
         System.out.println("\n3-Afficher votre liste d'Amis");
          System.out.println("\n4-Voir les amis de même nationalité que vous");
           System.out.println("\n5-Voir les amis de nationalité differente");
            System.out.println("\n6-Afficher vos informations");
             System.out.println("\n7-Exit");
             
             do{
                  System.out.println("\nIntroduction du choix: ");
                 choix=clavier.nextInt();
                 switch(choix){
                     case 1 :
                        
                         System.out.println("Nom: ");
                          nom= clavier.next();
                    p.setNom(nom);
                          
                       
                       System.out.println("Prénom: ");
                       prenom= clavier.next();
                       p.setPrenom(prenom);
                         
                         System.out.println("Age: ");
                       age = clavier.nextInt();
                         p.setAge(age);
                         System.out.println("Nationalité: ");
                         nationalite= clavier.next();
                         p.setNationalite(nationalite);
                         
                         
                         
                         break;
                     case 2:
                         Personne.creerList();
                         
                         int i =0;
                                 String c;
                                 do{
                        
                          Personne.AjoutAmis(person);
                          System.out.println("Nom: ");
                          person.amis[i].nom= clavier.next();
                       
                       System.out.println("Prénom: ");
                       person.amis[i].prenom= clavier.next();
                         
                         System.out.println("Age: ");
                       person.amis[i].age = clavier.nextInt();
                         
                         System.out.println("Nationalité: ");
                         person.amis[i].nationalite= clavier.next(); i++;
                         System.out.println("ajouter un autre? OUI ou NON");
                         c=clavier.next();
                         
                         }while("OUI".equals(c) && i<person.amis.length );
                         
                          
                         break;
                     case 3:
                         p.maList(person);
                         break;
                         
                         
                     case 4:
                         p.amisAlgerien(person);
                         break;
                     case 5 :
                        p.amisEtranger(person);
                         break;
                     case 6 :
                         System.out.print(p);
                         break;
                     case 7:
                         System.out.println("Merci! ");
                         break;
                         
                         
                         
                    
                         
                         
                 }
                 System.out.println("Voulez vous continuer OUI ou NON");
                 System.out.println("votre choix");
                 choice= clavier.next();
             }while("OUI".equals(choice));
             
        
        
    }
    
}
