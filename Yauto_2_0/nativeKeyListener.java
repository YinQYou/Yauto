package Yauto_2_0;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class nativeKeyListener implements NativeKeyListener {

    private final String key = "m";

    private final MFrame frame;
    private final MAction action;

    public nativeKeyListener(MFrame frame) {

        this.frame = frame;
        this.action = new MAction(this.frame);

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {

        if (NativeKeyEvent.getKeyText(e.getKeyCode()).toLowerCase().equals(key.toLowerCase())) { // executes if pressed.equals(hotkey)
            if (((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                action.orStartStop("Start");
            }
            else {
                action.orStartStop("Stop");
            }
        }
    }

}
