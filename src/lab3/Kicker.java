/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chris
 */
public class Kicker extends SpecialTeams{
   private String kick;
   
   //letting this player be able to kick the ball
   public void setKick(String kick){
       this.kick = kick;
   }
   
   public String getKick(){
       return kick;
   }
   
    
}
