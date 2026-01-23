package Yauto_2_0;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class nativeKeyListener implements NativeKeyListener {

    private final Character key = '\\';

    private final MFrame frame;
    private final MAction action;

    public nativeKeyListener(MFrame frame) {

        this.frame = frame;
        this.action = new MAction(this.frame);

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

        if ((int) e.getKeyChar() == (int) key) { // executes if pressed.equals(hotkey)
            if (((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                action.orStartStop("Start");
            }
            else {
                action.orStartStop("Stop");
            }
        }
    }

}
