/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chris
 */
public class Punter extends SpecialTeams{
       private String punt;
   
   //letting this player be able to punt the ball
   public void setKick(String punt){
       this.punt = punt;
   }
   
   public String getKick(){
       return punt;
   }
    
}
