package Yauto_2_0;

import javax.swing.JTextField;

public class MTextField extends JTextField{

    public MTextField(String text, int x, int y, int width, int height) {

        super(text);
        this.setBounds(x, y, width, height);

    }

}
