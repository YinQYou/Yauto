package Yauto_2_0;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import java.awt.*;

public class MFrame extends JFrame{

    private String hotkey = "m";

    public MFrame(String title, int width, int height) {

        this.setTitle(title); // sets the title of the Application Window as the "title" from the args
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default "X" button on the Application Window to actually close the application
        this.setLocationRelativeTo(null); // sets it to the "center"; top-left corner is centered
        this.setResizable(false); // disallows the users to resize the Application Window dimensions
        this.setLayout(null); // no layout managers

        MAction action1 = new MAction(this); // action thingy with our frame

        MButton mouseChoice = new MButton(action1, "Mouse", (50/3 * 1) + (100 * 0), 10, 100, 80, false);
        this.add(mouseChoice);

        MButton keyboardChoice = new MButton(action1, "Keyboard", (50/3 * 3) + (100 * 1), 10, 100, 80, true);
        this.add(keyboardChoice);

        MButton customChoice = new MButton(action1, "Custom", (50/3 * 5) + (100 * 2), 10, 100, 80,true);
        this.add(customChoice);

        MLabel hoursLabel = new MLabel("Hours", 10, (10 * 3) + (80 * 1), 80, 40);
        MTextField hours = new MTextField("0", 10, (10 * 3) + (80 * 1) + 40, 80, 40);
        this.add(hoursLabel);
        this.add(hours);

        MLabel minutesLabel = new MLabel("Minutes", (10 * 3) + (80 * 1), (10 * 3) + (80 * 1), 80, 40);
        MTextField minutes = new MTextField("0", (10 * 3) + (80 * 1), (10 * 3) + (80 * 1) + 40, 80, 40);
        this.add(minutesLabel);
        this.add(minutes);

        MLabel secondsLabel = new MLabel("Seconds", (10 * 5) + (80 * 2), (10 * 3) + (80 * 1), 80, 40);
        MTextField seconds = new MTextField("1", (10 * 5) + (80 * 2), (10 * 3) + (80 * 1) + 40, 80, 40);
        this.add(secondsLabel);
        this.add(seconds);

        MLabel millisecondsLabel = new MLabel("Milliseconds", (10 * 7) + (80 * 3), (10 * 3) + (80 * 1), 80, 40);
        MTextField milliseconds = new MTextField("0", (10 * 7) + (80 * 3), (10 * 3) + (80 * 1) + 40, 80, 40);
        this.add(millisecondsLabel);
        this.add(milliseconds);

        String[] combos = {"Left", "Middle", "Right"};
        MComboBox mouseCombos = new MComboBox(combos, (50/3), (10 * 5) + (80 * 2), 100, 80);
        this.add(mouseCombos);

        ButtonGroup repetitionGroup = new ButtonGroup();

        MRButton infinite = new MRButton(action1, "Infinite", (50/3 * 2) + 100 + 25/3, (10 * 5) + (80 * 2), 50, 80, true);
        repetitionGroup.add(infinite);
        this.add(infinite);

        MRButton definite = new MRButton(action1, "Repeat: ", (50/3 * 2) + 100 + (25/3 * 2) + 50 + 25, (10 * 5) + (80 * 2), 75, 80);
        repetitionGroup.add(definite);
        this.add(definite);

        MTextField repetitions = new MTextField("0", (50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2), 75, 80);
        this.add(repetitions);

        MButton start = new MButton(action1, "Start", 10, (10 * 7) + (80 * 3), 80, 80);
        this.add(start);

        MButton stop = new MButton(action1, "Stop", (10 * 3) + (80 * 1), (10 * 7) + (80 * 3), 80, 80, false);
        this.add(stop);

        MLabel hotkey = new MLabel("Hotkey: " + this.hotkey, (10 * 4) + (80 * 2) + 20, (10 * 7) + (80 * 3), 120, 80);
        this.add(hotkey);

        MButton settings = new MButton(action1, "Settings", (10 * 4) + (80 * 2) + (20 * 2) + 120 + 10, (10 * 7) + (80 * 3) + 60, 20, 20);
        this.add(settings);

        this.getContentPane().setPreferredSize(new Dimension(width, height)); // sets the "Content Pane" the actual usable part of the Application Window to "width" and "height"
        this.pack(); // packs everything--the Content Pane
        this.setLocation(this.getX() - this.getWidth() / 2, this.getY() - this.getHeight() / 2); // actually sets the Application Window to be centered

    }

}
