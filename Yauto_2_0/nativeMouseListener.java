package Yauto_2_0;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;

public class nativeMouseListener implements NativeMouseInputListener {

    public nativeMouseListener() {}

    public void nativeMouseClicked(NativeMouseEvent e) {
        System.out.println(e.getButton());
    }

    public int getClick(NativeMouseEvent e) {
        return e.getButton();
    }

}
