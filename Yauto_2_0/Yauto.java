package Yauto_2_0;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Yauto {

    static void main(String[] args) {

        MFrame Yauto2 = new MFrame("Yauto", 400, 400);

        Yauto2.getContentPane().setFocusable(true);
        Yauto2.getContentPane().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Yauto2.getContentPane().requestFocusInWindow();
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        Yauto2.setVisible(true);

        try {
            GlobalScreen.registerNativeHook(); // starts the hook
        }
        catch (NativeHookException e) {
            System.out.println("idk bruh");
        }

        nativeKeyListener kL = new nativeKeyListener(Yauto2);
        GlobalScreen.addNativeKeyListener(kL);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                if (GlobalScreen.isNativeHookRegistered()) {
                    GlobalScreen.unregisterNativeHook(); // ends the hook
                }
            }
            catch (Exception ignored) {}
        }));

        

    }

}
