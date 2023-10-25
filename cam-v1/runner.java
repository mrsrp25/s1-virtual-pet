import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class runner{
   
    private static final Component Response = null;
    public static void takeABeat(int milliseconds){
        try {
            Thread.sleep(3000); //milliseconds
        } catch(Exception e){
        
        }

    }
    public static void main (String [] args){
        VirtualPet v1 = new VirtualPet();
        v1.chill();
        takeABeat(4000);

         Object[] options = {"Yes","No"};
int n = JOptionPane.showOptionDialog(new JFrame(),
"Do you want to explore"
+ " Doraemon and his friends?",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[1]);



v1.work();
takeABeat(6000);


v1.Nobita();



takeABeat(6000);

v1.Sizuka();


takeABeat(6000);

v1.Gian();
takeABeat(6000);

v1.Suneo();

takeABeat(10000);

         Object[] opt = {"Yes","No"};
int b = JOptionPane.showOptionDialog(new JFrame(),
"We finished the introduction "
+ " Shall we start the story?",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[1]);

takeABeat(10000);

v1.episode();

takeABeat(50000);

v1.sleeping();

takeABeat(500000);

v1.clock();

takeABeat(10000);

v1.wakeUp();

takeABeat(10000);
v1.late();

takeABeat(10000);

v1.run();
takeABeat(10000);

v1.granny();
takeABeat(10000);

v1.school();

takeABeat(10000);

v1.meet();

takeABeat(10000);

v1.comes();
takeABeat(10000);

v1.bully();
takeABeat(10000);
v1.cry();
takeABeat(10000);
v1.sir();
takeABeat(10000);
v1.teacher();
takeABeat(10000);
v1.learn();
takeABeat(10000);
v1.tears();














   


 
        takeABeat(4000);

       

    
      
        takeABeat(5000);
       
                   };
  
        

    
}