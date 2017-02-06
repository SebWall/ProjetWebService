/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilisateurs;

import articles.Article;
import commun.ImagePanel;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebastien
 */
@Entity
@XmlRootElement
public class Membre implements Serializable {
    
///////////// VARIABLES //////////////////////////////   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;  
    private String lastname;  
    private String about;
    private ImagePanel photo;
    private String username;
    private String last_connected;
    private Role role;
    @OneToOne
    private Article autheur;

//////////////////// CONSTRUCTEURS /////////////////////
    
    public Membre(){
        
    }

    public Membre(int id, String firstname, String lastname, String about, ImagePanel photo, String username, String last_connected, Role role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.about = about;
        this.photo = photo;
        this.username = username;
        this.last_connected = last_connected;
        this.role = role;
    }

/////// GETTER & SETTER /////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public ImagePanel getPhoto() {
        return photo;
    }

    public void setPhoto(ImagePanel photo) {
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLast_connected() {
        return last_connected;
    }

    public void setLast_connected(String last_connected) {
        this.last_connected = last_connected;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
} 