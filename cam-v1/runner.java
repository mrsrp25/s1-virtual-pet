import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class runner {

    private static final Component Response = null;

    public static void takeABeat(int milliseconds) {
        try {
            Thread.sleep(3000); // milliseconds
        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        VirtualPet v1 = new VirtualPet();
        v1.chill();
        takeABeat(4000);

        Object[] options = { "Yes", "No" };
        int n = JOptionPane.showOptionDialog(new JFrame(),
                "Do you want to explore"
                        + " Doraemon and his friends?",
                "A Silly Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        System.out.println(n);
        if (n == 1) {
            System.exit(0);
        }
v1.work();
takeABeat(10000);
v1.Nobita();
takeABeat(10000);
v1.Sizuka();
takeABeat(10000);
v1.Gian();
takeABeat(10000);
v1.Suneo();

        takeABeat(10000);

        

        Object[] opt = { "Yes", "No" };
        int b = JOptionPane.showOptionDialog(new JFrame(),
                "We finished the introduction "
                        + " Shall we start the story?",
                "A Silly Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        System.out.println(b);
        if (b == 1) {
            System.exit(0);

        }
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

        takeABeat(10000);
        v1.vacation();

        takeABeat(10000);
        v1.later();
        takeABeat(10000);
        v1.adventure();
        takeABeat(100000);



        Object[] opti = { "Yes", "No" };
        int t = JOptionPane.showOptionDialog(new JFrame(),
                " "
                        + " Do you wanna explore Goody Land",
                "A Silly Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        System.out.println(t);
        if (t == 1) {
            System.exit(0);
        }

        ArrayList<String> Characters = new ArrayList<String>();
        Characters.add("Dekisuki");
        Characters.add("Nobita's Mom");
        Characters.add("Gian's Mom");
        Characters.add("Suneo's Mom");
        Characters.add("doremi");

        for(int i = 0; i<Characters.size(); i++){
            System.out.println(Characters.get(i));
        }
        
        v1.Characters(Characters);

    }

       

   
       
                   };

