/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilisateurs;

/**
 *
 * @author sebastien
 */
public class Role {
    
    ///////////// VARIABLES //////////////////////////////   
    private String name;
    private String description;
    
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
