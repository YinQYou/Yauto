package Yauto_2_0;

import javax.swing.JButton;

public class MButton extends JButton{

    public MButton(MAction action, String text, int x, int y, int width, int height) {

        this.setAction(action);
        this.setText(text);
        this.setBounds(x, y, width, height);

    }

    public MButton(MAction action, String text, int x, int y, int width, int height, boolean onOroff) {

        this.setAction(action);
        this.setText(text);
        this.setBounds(x, y, width, height);
        this.setEnabled(onOroff);

    }

}
