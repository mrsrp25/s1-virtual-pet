import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class runner{
   
    private static final Component Response = null;
    public static void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){
        
        }

    }
    public static void main (String [] args){
        VirtualPet v1 = new VirtualPet();
        v1.chill();
        takeABeat(4000);

         Object[] options = {"Yes","No"};
int n = JOptionPane.showOptionDialog(new JFrame(),
"Do you want me to play soccer "
+ "right now",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[1]);

    String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         "You want me to play soccer?",
         "Question?",
         JOptionPane.PLAIN_MESSAGE
       );


  System.out.println(s);
        takeABeat(4000);

       

    
        v1.football();
        takeABeat(5000);
         Object[] opt= {"Yes, please",
                    "No, thanks",
                   };
  
        

    
}}