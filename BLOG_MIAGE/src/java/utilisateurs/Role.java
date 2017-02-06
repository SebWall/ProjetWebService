/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilisateurs;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebastien
 */
@Entity
@XmlRootElement
public class Role implements Serializable {
    
    ///////////// VARIABLES //////////////////////////////   
    @Id
    private String name;
    private String description;

    public Role() {
    }
    
    //////////////////// CONSTRUCTEURS /////////////////////
    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    
    /////////////// GETTER & SETTER /////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  
}
