package Yauto_2_0;

import javax.swing.JDialog;
import java.awt.*;

public class MDialog extends JDialog{

    public MDialog(String title, int width, int height) {

        this.setModal(true);
        this.setTitle(title);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setAlwaysOnTop(true);



        this.getContentPane().setPreferredSize(new Dimension(width, height)); // sets the "Content Pane" the actual usable part of the Application Window to "width" and "height"
        this.pack(); // packs everything--the Content Pane
    }

}
