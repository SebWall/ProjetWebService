/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articles;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sebastien
 */
public class Article {
    
    ///////////// VARIABLES //////////////////////////////   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String datePublication;
    private String membrePubli;
    
    //////////////////// CONSTRUCTEURS /////////////////////
    public Article(){
    }

    public Article(int id, String nom, String membrePubli) {
        this.id = id;
        this.nom = nom;
        this.membrePubli = membrePubli;
    }

    /////// GETTER & SETTER /////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getMembrePubli() {
        return membrePubli;
    }

    public void setMembrePubli(String membrePubli) {
        this.membrePubli = membrePubli;
    }
    



}
