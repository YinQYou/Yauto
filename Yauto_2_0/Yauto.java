package Yauto_2_0;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;

public class Yauto {

    static void main(String[] args) {

        MFrame Yauto2 = new MFrame("Yauto", 400, 400);
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
