/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.yrfnrtfhthrfbhtrff
 */
package MonPackage;
/**
 *
 * @author Rabelais
 */
public class Employe {

    private int numero;
    private String nom, adr;
    private double salaire;
    
    public void init(int pnumero, String pnom, String padr, double psalaire){
        numero = pnumero;
        nom = pnom;
        adr = padr;
        salaire = psalaire;
    }
    
    public void augmenter(int ppourc) {
        this.salaire = ppourc * salaire;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
}
