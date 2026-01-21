package Yauto_2_0;

import javax.swing.*;

public class MRButton extends JRadioButton {

    public MRButton(MAction action, String text, int x, int y, int width, int height) {

        this.setAction(action);
        this.setText(text);
        this.setBounds(x, y, width, height);

    }

    public MRButton(MAction action, String text, int x, int y, int width, int height, boolean selected) {

        this.setAction(action);
        this.setText(text);
        this.setBounds(x, y, width, height);
        this.setSelected(selected);

    }

}
