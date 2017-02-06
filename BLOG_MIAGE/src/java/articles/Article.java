/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articles;

import commun.ImagePanel;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import utilisateurs.Membre;

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
    private String titre;
    private String motCle;
    private String published_on;
    private String content;
    private ImagePanel photo;
    private String position_long;
    private String position_lat;
    private String position_name;
    private Membre autheur;
    private Status status;
    private Commentaire comment;

    //////////////////// CONSTRUCTEURS /////////////////////
    public Article(int id, String titre, String motCle, String published_on, String content, ImagePanel photo, String position_long, String position_lat, String position_name, Membre autheur, Status status, Commentaire comment) {
        this.id = id;
        this.titre = titre;
        this.motCle = motCle;
        this.published_on = published_on;
        this.content = content;
        this.photo = photo;
        this.position_long = position_long;
        this.position_lat = position_lat;
        this.position_name = position_name;
        this.autheur = autheur;
        this.status = status;
        this.comment = comment;
    }

    /////// GETTER & SETTER /////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public String getPublished_on() {
        return published_on;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ImagePanel getPhoto() {
        return photo;
    }

    public void setPhoto(ImagePanel photo) {
        this.photo = photo;
    }

    public String getPosition_long() {
        return position_long;
    }

    public void setPosition_long(String position_long) {
        this.position_long = position_long;
    }

    public String getPosition_lat() {
        return position_lat;
    }

    public void setPosition_lat(String position_lat) {
        this.position_lat = position_lat;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    public Membre getAutheur() {
        return autheur;
    }

    public void setAutheur(Membre autheur) {
        this.autheur = autheur;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Commentaire getComment() {
        return comment;
    }

    public void setComment(Commentaire comment) {
        this.comment = comment;
    }
    
}