/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chris
 */
public class Defense extends FootballTeam{
        //every player will run, but offense, defense, special teams will run differently
    private String run;
    private String tackle;
    
    
    //defense class will use a concrete method to tackle and run
    public void setTackle(){
        //method to tackle
    }
    
    public String getTackle(){
        return tackle;
    }
    public void setRun(){
        //method to run
    }
    
    public String getRun(){
        return run;
    }
    
}
