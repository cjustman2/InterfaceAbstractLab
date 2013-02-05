/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chris
 */
public abstract class FootballTeam {
    private String jump;
    
    //every class has to have setters and getters for a run method
    //all players should be able to run but at different speeds
    public abstract void setRun();
    public abstract String getRun();
    
    
    //every player has to be able to tackle
    public abstract void setTackle();
    public abstract String getTackle();
    
    
    //every player can jump the same, using concrete method in superclass
    public void setJump(String jump){
        //method to jump
    }
    
    public String getJump(){
        return jump;
    }
    
    
}
