/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articles;

import java.util.Date;
import utilisateurs.Membre;

/**
 *
 * @author sebastien
 */
public class Commentaire {
    
    
 ///////////// VARIABLES //////////////////////////////   
    
    private String comment;
    private Date date;
    private Membre autheur;
    
//////////////////// CONSTRUCTEURS /////////////////////
     public Commentaire(String comment, Date date, Membre autheur) {
       this.comment = comment;
       this.date = date;
       this.autheur = autheur;
    }
    
/////////////// GETTER & SETTER /////////////////

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Membre getAutheur() {
        return autheur;
    }

    public void setAutheur(Membre autheur) {
        this.autheur = autheur;
    }


}
