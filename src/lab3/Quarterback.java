/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author chris
 */
public class Quarterback extends Offense{
    
    public String throwBall;
    
    
    //only quarterback can throw the ball
    public void setThrowBall(String throwBall) {
        this.throwBall = throwBall;
    }

    public String getThrowBall() {
        return throwBall;
    }
    
    
    
}
