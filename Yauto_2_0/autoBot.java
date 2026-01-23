package Yauto_2_0;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class autoBot {

    private final MFrame frame;

    public autoBot(MFrame frame) {

        this.frame = frame;

    }

    private int getDelay() {

        int hours = Integer.parseInt(((MTextField) this.frame.getContentPane().getComponentAt(10, (10 * 3) + (80 * 1) + 40)).getText());
        int minutes = Integer.parseInt(((MTextField) this.frame.getContentPane().getComponentAt((10 * 3) + (80 * 1), (10 * 3) + (80 * 1) + 40)).getText());
        int seconds = Integer.parseInt(((MTextField) this.frame.getContentPane().getComponentAt((10 * 5) + (80 * 2), (10 * 3) + (80 * 1) + 40)).getText());
        int milliseconds = Integer.parseInt(((MTextField) this.frame.getContentPane().getComponentAt((10 * 7) + (80 * 3), (10 * 3) + (80 * 1) + 40)).getText());

        return (hours * 3600000) + (minutes * 60000) + (seconds * 1000) + (milliseconds) < 8 ? 8 : (hours * 3600000) + (minutes * 60000) + (seconds * 1000) + (milliseconds);

    }

    public void moused(String which) {

        boolean infdef = ((MRButton) this.frame.getContentPane().getComponentAt((50/3 * 2) + 100 + 25/3, (10 * 5) + (80 * 2))).isSelected();
        int delay = getDelay();

        switch (which) {
            case "Left" -> lClick(infdef, delay);
            case "Middle" -> mClick(infdef, delay);
            case "Right" -> rClick(infdef, delay);
        }
    }

    public void lClick(boolean inf, int delay) {
        if (inf) {
            Thread iLeftClick = new Thread(() -> {
                try {
                    Robot infLeft = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                        infLeft.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        infLeft.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        infLeft.delay(delay);
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
                    int repetitions = Integer.parseInt(((MTextField) frame.getContentPane().getComponentAt((50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2))).getText());
                    Robot defLeft = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled() && repetitions > 0) {
                        System.out.println(repetitions);
                        repetitions -= 1;
                        defLeft.delay(delay);
                    }

                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            dLeftClick.start();
        }
    }

    public void mClick(boolean inf, int delay) {
        if (inf) {
            Thread iMiddleClick = new Thread(() -> {
                try {
                    Robot infMiddle = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                        infMiddle.mousePress(InputEvent.BUTTON2_DOWN_MASK);
                        infMiddle.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
                        infMiddle.delay(delay);
                    }
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            iMiddleClick.start();
        }
        else {
            Thread dMiddleClick = new Thread(() -> {
                try {
                    int repetitions = Integer.parseInt(((MTextField) frame.getContentPane().getComponentAt((50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2))).getText());
                    Robot defMiddle = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled() && repetitions > 0) {
                        repetitions -= 1;
                        defMiddle.mousePress(InputEvent.BUTTON2_DOWN_MASK);
                        defMiddle.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
                        defMiddle.delay(delay);
                    }

                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            dMiddleClick.start();
        }
    }

    public void rClick(boolean inf, int delay) {
        if (inf) {
            Thread iRightClick = new Thread(() -> {
                try {
                    Robot infRight = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                        infRight.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                        infRight.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                        infRight.delay(delay);
                    }
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            iRightClick.start();
        }
        else {
            Thread dRightClick = new Thread(() -> {
                try {
                    int repetitions = Integer.parseInt(((MTextField) frame.getContentPane().getComponentAt((50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2))).getText());
                    Robot defRight = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled() && repetitions > 0) {
                        repetitions -= 1;
                        defRight.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                        defRight.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                        defRight.delay(delay);
                    }

                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            dRightClick.start();
        }
    }

    public void keyed(String which) {

        boolean infdef = ((MRButton) this.frame.getContentPane().getComponentAt((50/3 * 2) + 100 + 25/3, (10 * 5) + (80 * 2))).isSelected();
        int delay = getDelay();

        if (infdef) {
            Thread infKey = new Thread(() -> {
                try {
                    Robot iKey = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                        switch (which) {
                            case "A":
                                iKey.keyPress(KeyEvent.VK_A);
                                iKey.keyRelease(KeyEvent.VK_A);
                                break;
                            case "B":
                                iKey.keyPress(KeyEvent.VK_B);
                                iKey.keyRelease(KeyEvent.VK_B);
                                break;
                            case "C":
                                iKey.keyPress(KeyEvent.VK_C);
                                iKey.keyRelease(KeyEvent.VK_C);
                                break;
                            case "D":
                                iKey.keyPress(KeyEvent.VK_D);
                                iKey.keyRelease(KeyEvent.VK_D);
                                break;
                            case "E":
                                iKey.keyPress(KeyEvent.VK_E);
                                iKey.keyRelease(KeyEvent.VK_E);
                                break;
                            case "F":
                                iKey.keyPress(KeyEvent.VK_F);
                                iKey.keyRelease(KeyEvent.VK_F);
                                break;
                            case "G":
                                iKey.keyPress(KeyEvent.VK_G);
                                iKey.keyRelease(KeyEvent.VK_G);
                                break;
                            case "H":
                                iKey.keyPress(KeyEvent.VK_H);
                                iKey.keyRelease(KeyEvent.VK_H);
                                break;
                            case "I":
                                iKey.keyPress(KeyEvent.VK_I);
                                iKey.keyRelease(KeyEvent.VK_I);
                                break;
                            case "J":
                                iKey.keyPress(KeyEvent.VK_J);
                                iKey.keyRelease(KeyEvent.VK_J);
                                break;
                            case "K":
                                iKey.keyPress(KeyEvent.VK_K);
                                iKey.keyRelease(KeyEvent.VK_K);
                                break;
                            case "L":
                                iKey.keyPress(KeyEvent.VK_L);
                                iKey.keyRelease(KeyEvent.VK_L);
                                break;
                            case "M":
                                iKey.keyPress(KeyEvent.VK_M);
                                iKey.keyRelease(KeyEvent.VK_M);
                                break;
                            case "N":
                                iKey.keyPress(KeyEvent.VK_N);
                                iKey.keyRelease(KeyEvent.VK_N);
                                break;
                            case "O":
                                iKey.keyPress(KeyEvent.VK_O);
                                iKey.keyRelease(KeyEvent.VK_O);
                                break;
                            case "P":
                                iKey.keyPress(KeyEvent.VK_P);
                                iKey.keyRelease(KeyEvent.VK_P);
                                break;
                            case "Q":
                                iKey.keyPress(KeyEvent.VK_Q);
                                iKey.keyRelease(KeyEvent.VK_Q);
                                break;
                            case "R":
                                iKey.keyPress(KeyEvent.VK_R);
                                iKey.keyRelease(KeyEvent.VK_R);
                                break;
                            case "S":
                                iKey.keyPress(KeyEvent.VK_S);
                                iKey.keyRelease(KeyEvent.VK_S);
                                break;
                            case "T":
                                iKey.keyPress(KeyEvent.VK_T);
                                iKey.keyRelease(KeyEvent.VK_T);
                                break;
                            case "U":
                                iKey.keyPress(KeyEvent.VK_U);
                                iKey.keyRelease(KeyEvent.VK_U);
                                break;
                            case "V":
                                iKey.keyPress(KeyEvent.VK_V);
                                iKey.keyRelease(KeyEvent.VK_V);
                                break;
                            case "W":
                                iKey.keyPress(KeyEvent.VK_W);
                                iKey.keyRelease(KeyEvent.VK_W);
                                break;
                            case "X":
                                iKey.keyPress(KeyEvent.VK_X);
                                iKey.keyRelease(KeyEvent.VK_X);
                                break;
                            case "Y":
                                iKey.keyPress(KeyEvent.VK_Y);
                                iKey.keyRelease(KeyEvent.VK_Y);
                                break;
                            case "Z":
                                iKey.keyPress(KeyEvent.VK_Z);
                                iKey.keyRelease(KeyEvent.VK_Z);
                                break;
                        }
                        iKey.delay(delay);
                    }
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            infKey.start();
        }
        else {
            Thread defKey = new Thread(() -> {
                try {
                    int repetitions = Integer.parseInt(((MTextField) frame.getContentPane().getComponentAt((50/3 * 2) + 100 + (25/3 * 2) + 50 + (25 * 2) + 75, (10 * 5) + (80 * 2))).getText());
                    Robot dKey = new Robot();

                    while (!((MButton) frame.getContentPane().getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled() && repetitions > 0) {
                        repetitions--;
                        switch (which) {
                            case "A":
                                dKey.keyPress(KeyEvent.VK_A);
                                dKey.keyRelease(KeyEvent.VK_A);
                                break;
                            case "B":
                                dKey.keyPress(KeyEvent.VK_B);
                                dKey.keyRelease(KeyEvent.VK_B);
                                break;
                            case "C":
                                dKey.keyPress(KeyEvent.VK_C);
                                dKey.keyRelease(KeyEvent.VK_C);
                                break;
                            case "D":
                                dKey.keyPress(KeyEvent.VK_D);
                                dKey.keyRelease(KeyEvent.VK_D);
                                break;
                            case "E":
                                dKey.keyPress(KeyEvent.VK_E);
                                dKey.keyRelease(KeyEvent.VK_E);
                                break;
                            case "F":
                                dKey.keyPress(KeyEvent.VK_F);
                                dKey.keyRelease(KeyEvent.VK_F);
                                break;
                            case "G":
                                dKey.keyPress(KeyEvent.VK_G);
                                dKey.keyRelease(KeyEvent.VK_G);
                                break;
                            case "H":
                                dKey.keyPress(KeyEvent.VK_H);
                                dKey.keyRelease(KeyEvent.VK_H);
                                break;
                            case "I":
                                dKey.keyPress(KeyEvent.VK_I);
                                dKey.keyRelease(KeyEvent.VK_I);
                                break;
                            case "J":
                                dKey.keyPress(KeyEvent.VK_J);
                                dKey.keyRelease(KeyEvent.VK_J);
                                break;
                            case "K":
                                dKey.keyPress(KeyEvent.VK_K);
                                dKey.keyRelease(KeyEvent.VK_K);
                                break;
                            case "L":
                                dKey.keyPress(KeyEvent.VK_L);
                                dKey.keyRelease(KeyEvent.VK_L);
                                break;
                            case "M":
                                dKey.keyPress(KeyEvent.VK_M);
                                dKey.keyRelease(KeyEvent.VK_M);
                                break;
                            case "N":
                                dKey.keyPress(KeyEvent.VK_N);
                                dKey.keyRelease(KeyEvent.VK_N);
                                break;
                            case "O":
                                dKey.keyPress(KeyEvent.VK_O);
                                dKey.keyRelease(KeyEvent.VK_O);
                                break;
                            case "P":
                                dKey.keyPress(KeyEvent.VK_P);
                                dKey.keyRelease(KeyEvent.VK_P);
                                break;
                            case "Q":
                                dKey.keyPress(KeyEvent.VK_Q);
                                dKey.keyRelease(KeyEvent.VK_Q);
                                break;
                            case "R":
                                dKey.keyPress(KeyEvent.VK_R);
                                dKey.keyRelease(KeyEvent.VK_R);
                                break;
                            case "S":
                                dKey.keyPress(KeyEvent.VK_S);
                                dKey.keyRelease(KeyEvent.VK_S);
                                break;
                            case "T":
                                dKey.keyPress(KeyEvent.VK_T);
                                dKey.keyRelease(KeyEvent.VK_T);
                                break;
                            case "U":
                                dKey.keyPress(KeyEvent.VK_U);
                                dKey.keyRelease(KeyEvent.VK_U);
                                break;
                            case "V":
                                dKey.keyPress(KeyEvent.VK_V);
                                dKey.keyRelease(KeyEvent.VK_V);
                                break;
                            case "W":
                                dKey.keyPress(KeyEvent.VK_W);
                                dKey.keyRelease(KeyEvent.VK_W);
                                break;
                            case "X":
                                dKey.keyPress(KeyEvent.VK_X);
                                dKey.keyRelease(KeyEvent.VK_X);
                                break;
                            case "Y":
                                dKey.keyPress(KeyEvent.VK_Y);
                                dKey.keyRelease(KeyEvent.VK_Y);
                                break;
                            case "Z":
                                dKey.keyPress(KeyEvent.VK_Z);
                                dKey.keyRelease(KeyEvent.VK_Z);
                                break;
                        }
                        dKey.delay(delay);
                    }
                }
                catch (java.awt.AWTException exception) {
                    System.out.println(exception);
                }
            });
            defKey.start();
        }

    }

}
