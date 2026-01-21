package Yauto_2_0;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class autoBot {

    private final MFrame frame;

    public autoBot(MFrame frame) {

        this.frame = frame;

    }

    public void moused(String which) {

        boolean infdef = ((MRButton) this.frame.getContentPane().getComponentAt((50/3 * 2) + 100 + 25/3, (10 * 5) + (80 * 2))).isSelected();

        switch (which) {
            case "Left" -> lClick(infdef);
            case "Middle" -> System.out.println("you clicked middle");
            case "Right" -> System.out.println("you clicked right");
        }
    }

    public void lClick(boolean inf) {
        if (inf) {
            Thread iLeftClick = new Thread(() -> {
                try {
                    Robot infLeft = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                        infLeft.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        infLeft.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        infLeft.delay(1000);
                    }
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            iLeftClick.start();
        }
        else {
            Thread dLeftClick = new Thread(() -> {
                try {
                    Robot defLeft = new Robot();

                    System.out.println(((MTextField) frame.getContentPane().getComponentAt((50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2))).getText());
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            dLeftClick.start();
        }
    }

    public void keyed(String which) {

        System.out.println(which);

    }

}
