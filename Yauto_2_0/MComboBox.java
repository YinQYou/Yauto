package Yauto_2_0;

import javax.swing.*;

public class MComboBox extends JComboBox{

    public MComboBox(String[] options, int x, int y, int width, int height) {

        super(options);
        this.setBounds(x, y, width, height);

    }

}
