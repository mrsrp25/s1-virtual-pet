/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

import java.awt.Component;
import java.util.ArrayList;

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

    public void episode(){
        excitement = excitement + 2;
        face.setImage("episode");
        face.setMessage("Doraemon and the Mystery of Goody land");
    }
    public void sleeping(){
        excitement = excitement - 1;
        face.setImage("sleeping");
        face.setMessage("Nobita is Sleeping in his room like always");
    }
   public void clock(){
    excitement = excitement + 0;
    face.setImage("clock");
    face.setMessage("And Suddenly the alarm clock rings");
   }
    
   public void wakeUp(){
    excitement = excitement - 2;
    face.setImage("wakeup");
    face.setMessage("He wakes up after a deep sleep");
   }
   public void late(){
    excitement = excitement + 1;
    face.setImage("late");
    face.setMessage("Doraemon says Nobita to wake up and run as he was late!!!!");
   }
   public void run(){
    excitement = excitement + 5;
    face.setImage("run");
    face.setMessage("Nobita took his bag and started running downstairs");
   }
   public void granny(){
    excitement = excitement + 10;
    face.setImage("granny");
    face.setMessage("Suddenly he sees his grandmother and he hugs her");
   }
   public void school(){
    excitement = excitement +2;
    face.setImage("school");
    face.setMessage("Then he leaves to go to school");
   }

   public void meet(){
    excitement = excitement + 500;
    face.setImage("meet");
    face.setMessage("On the Way he meets Shizuka and decides to go with her");
   }
   public void comes(){
    excitement = excitement - 200;
    face.setImage("comes");
    face.setMessage("Then a little bit later he meets Gian and Suneo");
   }
   public void bully(){
    excitement = excitement -200;
    face.setImage("bully");
    face.setMessage("Gian and Suneo started bullying Nobita and scaring him");
   }
   public void cry(){
    excitement = excitement -100;
    face.setImage("cry");
    face.setMessage("Nobita started crying and running to school");
   }
   public void sir(){
    excitement = excitement - 3;
    face.setImage("sir");
    face.setMessage("Then he reached his class and found out that he was late");
   }
   public void teacher(){
    excitement = excitement - 3;
    face.setImage("teacher");
    face.setMessage("His teacher punishes him and tells him to stand outside");
   }
   public void learn(){
    excitement = excitement + 200;
    face.setImage("learn");
    face.setMessage("After school Shizuka invites nobita and her friends for a handout in the park");
   }
   public void tears(){
    excitement = excitement + 20;
    face.setImage("tears");
    face.setMessage("They started making a Plan to have a vacation for a week");
   }
   public void vacation(){
    excitement = excitement + 50;
    face.setImage("vacation");
    face.setMessage("They Finally decided to go to Goody land which is a fun place for adventure");
    }
    public void later(){
        excitement = excitement +1;
        face.setImage("24hours");
        face.setMessage("24 hours later");
    }
    public void adventure(){
        excitement = excitement+2;
        face.setImage("adventure");
        face.setMessage("Everyone have reached Goody Land Safely and Nobita is enjoying it with his friends");
    }

   public  void Characters(ArrayList<String> characters) {
        for (String character : characters) {
            if (character.length() % 2 == 0) {
             
               face.setImage("fry");
               face.setMessage("Hello my friends");
              
               }
               else{
                face.setImage("sorry");
                face.setMessage("Sorry Try Again");
               }}}
               public void bold(){
                excitement = excitement + 6;
                face.setImage("mummy");
                face.setMessage("They thought to build a house and with the help of Doraemon they did build a house");
               }

        }
    



