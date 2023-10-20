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
        face.setImage("die");
        face.setMessage("Hello I am Doraemon");
    }
    public void Nobita(){
        excitement = excitement + 2;
        face.setImage("Nobita");
        face.setMessage("Hello I am Nobita");
    }
    public void Sizuka(){
        excitement = excitement + 2;
        face.setImage("kill");
        face.setMessage("Hello I am Sizuka");
    }
    public void Gian(){
        excitement = excitement+2;
        face.setImage("Gian");
        face.setMessage("Hello I am Gian");
    }
    public void Suneo(){
        excitement = excitement + 2;
        face.setImage("dance");
        face.setMessage("Hello I am Suneo");
    }
    public void chill(){
        excitement = excitement + 2;
        face.setMessage("Hello guys");
        face.setImage("friends");
    }
    public void football(){
        excitement = excitement+2;
        face.setMessage("Thats a goalllllll  Wooooahhhhhhhhhh!");
        face.setImage("football");
    }
 
   
    
;

} // end Virtual Pet
