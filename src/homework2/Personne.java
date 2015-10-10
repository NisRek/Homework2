/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Personne {
    
    static String nom;
    static String prenom;
    static  String nationalite;
    int age;
    private static int nbAmis;
   static  Personne [] amis;
    
    // constructeurs
    Scanner clavier= new Scanner(System.in);
    
    /**
     *
     * @param age
     * @param nom
     * @param prenom
     * @param nationalite
     */
    public Personne(int age, String nom, String prenom, String nationalite){
        this.nom= nom;
        this.prenom=prenom;
        this.age= age;
        this.nationalite = nationalite;
        
    }
    
    public Personne(){}
    
    
    //copie 
    public Personne(Personne person){
        nom=person.nom;
        prenom= person.prenom;
        age = person.age;
        nationalite = person.nationalite;
        
        
    }
    public static void creerList(){
        amis=new Personne[10];
    }
    
    
    public static void AjoutAmis(Personne p){
            amis[nbAmis] = new Personne(p);
            nbAmis++;
        
    }
    
    
    
    public static  void maList(Personne p){
        
        for(int i=0;i< p.amis.length;i++ )
            System.out.println(p.amis[i]);
        
    }
        public static void amisEtranger(Personne p){
        for (int i =0;i<  p.amis.length;i++) {
            if (!nationalite.equals(p.nationalite)) {
                System.out.println(p.amis[i]);
            }
        }
        }
        
    
        public static void amisAlgerien(Personne p){
        for (int i =0;i<  p.amis.length;i++) {
            if (nationalite.equals(p.nationalite)) {
                 System.out.println(p.amis[i]);
            }
           
        }
        }
        
    /**
     *
     * @return
     */
    @Override
        public  String toString(){
            return "nom: " + getNom() + "\nprenom: " +  getPrenom() + "\nnationalite: " + getNationalite() + "\nage: " + getAge() + " ans\n" ;
        }
        

    /**
     * @return the nom
     */
    public static String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public static void setNom(String nom) {
        Personne.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public static void setPrenom(String prenom) {
        Personne.prenom = prenom;
    }

    /**
     * @return the nationalite
     */
    public static String getNationalite() {
        return nationalite;
    }

    /**
     * @param nationalite the nationalite to set
     */
    public static void setNationalite(String nationalite) {
        Personne.nationalite = nationalite;
    }

    /**
     * @return the age
     */
    public  int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public   void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the nbAmis
     */
    public static int getNbAmis() {
        return nbAmis;
    }

    /**
     * @param nbAmis the nbAmis to set
     */
    public static void setNbAmis(int nbAmis) {
        Personne.nbAmis = nbAmis;
    }
    
}
