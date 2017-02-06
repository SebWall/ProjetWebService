/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sebastien
 */
package articles;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import utilisateurs.Membre;


@Entity
@XmlRootElement
public class Commentaire implements Serializable {  
    
 ///////////// VARIABLES //////////////////////////////   
    
    @Id
    private String comment;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    @ManyToOne
    private Membre autheur;

    public Commentaire() {
    }
    
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
