/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VirtualPet {
    
    VirtualPetFace face;
    int excitement = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void play() {
        if (excitement  > 10) {
            excitement = excitement - 10;
        } else {
            excitement = 0;
        }
        face.setMessage("Im, excited");
        face.setImage("joyful");
    }
    
    public void fight() {
        excitement = excitement + 3;
        face.setMessage("U wanna get this hands?");
        face.setImage("enraged");
    }
    
    public void work() {
        excitement = excitement + 1;
        face.setImage("verysick");
    }

    public void chill(){
        excitement = excitement + 1;
        face.setMessage("Its the best day ever!!!");
        face.setImage("asleep");
    }
    public void football(){
        excitement = excitement+1;
        face.setMessage("Thats a goalllllll  Wooooahhhhhhhhhh!");
        face.setImage("football");
    }
 
   
    
;

} // end Virtual Pet
