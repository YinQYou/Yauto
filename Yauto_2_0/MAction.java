package Yauto_2_0;

import java.awt.Container;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class MAction extends AbstractAction {

    private final Container cPane;
    private final autoBot bot;
    private final MDialog dialog;

    public MAction(MDialog dialog) {

        this.cPane = null;
        this.bot = null;
        this.dialog = dialog;

    }

    public MAction(MFrame frame) {

        this.cPane = frame.getContentPane();
        this.bot = new autoBot(frame);
        this.dialog = null;

    }

    public void actionPerformed(ActionEvent e) {

        try {
            switch (e.getActionCommand()) {
                case "Mouse", "Keyboard", "Custom" -> mainChoices(e.getActionCommand());
                case "Start", "Stop" -> orStartStop(e.getActionCommand());
                case "Settings" -> settingsMenu();
                case "New" -> changeHotkey();
            }
        }
        catch (Exception error) {
            System.out.println("what did you even do now ???");
        }


    }

    private void mainChoices(String text) {

        MButton mouse = (MButton) cPane.getComponentAt((50/3 * 1) + (100 * 0), 10); // mouseButton
        MButton keyboard = (MButton) cPane.getComponentAt((50/3 * 3) + (100 * 1), 10); // keyboardButton
        MButton custom = (MButton) cPane.getComponentAt((50/3 * 5) + (100 * 2), 10); // customButton

        switch (text) {
            case "Mouse" -> {
                mouse.setEnabled(false);
                keyboard.setEnabled(true);
                custom.setEnabled(true);
            }
            case "Keyboard" -> {
                mouse.setEnabled(true);
                keyboard.setEnabled(false);
                custom.setEnabled(true);
            }
            case "Custom" -> {
                mouse.setEnabled(true);
                keyboard.setEnabled(true);
                custom.setEnabled(false);
            }
        }

        changeLayout(text);

    }

    private void changeLayout(String text) {

        MComboBox combos = (MComboBox) cPane.getComponentAt((50/3), (10 * 5) + (80 * 2));
        String[] mouseOptions = {"Left", "Middle", "Right"};
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        combos.removeAllItems();

        switch (text) {
            case "Mouse" -> {
                for (String option : mouseOptions) {
                    combos.addItem(option);
                    combos.setVisible(true);
                }
            }
            case "Keyboard" -> {
                for (String letter : alphabet) {
                    combos.addItem(letter);
                    combos.setVisible(true);
                }
            }
            case "Custom" -> {
                combos.setVisible(false);
            }
        }
    }

    public void orStartStop(String text) {

        MButton start = (MButton) cPane.getComponentAt(10, (10 * 7) + (80 * 3));
        MButton stop = (MButton) cPane.getComponentAt((10 * 3) + (80 * 1), (10 * 7) + (80 * 3));

        switch (text) {
            case "Start" -> {
                start.setEnabled(false);
                stop.setEnabled(true);

                if (!((MButton) cPane.getComponentAt(10, (10 * 7) + (80 * 3))).isEnabled()) {
                    if (!cPane.getComponentAt((50/3 * 1) + (100 * 0), 10).isEnabled()) { // checks if the mouse is selected
                        bot.moused((String) ((MComboBox) cPane.getComponentAt((50/3), (10 * 5) + (80 * 2))).getSelectedItem());
                    }
                    else if (!cPane.getComponentAt((50/3 * 3) + (100 * 1), 10).isEnabled()) { // checks if the keyboard is selected
                        bot.keyed((String) ((MComboBox) cPane.getComponentAt((50/3), (10 * 5) + (80 * 2))).getSelectedItem());
                    }
                    else { // if not mouse or keyboard then custom
                        System.out.println("idk man");
                    }
                }

            }
            case "Stop" -> {
                start.setEnabled(true);
                stop.setEnabled(false);
            }
        }
    }

    private void settingsMenu() {
        MDialog dialog = new MDialog("Settings (WIP)", 200, 50);

        MButton newHotkey = new MButton(new MAction(dialog), "New", 125, 5, 70, 40);
        dialog.add(newHotkey);

        MLabel hotkey = new MLabel("Hotkey: ", 5, 5, 50, 40);
        dialog.add(hotkey);

        MTextField newkey = new MTextField("", 60, 5, 40, 40);
        dialog.add(newkey);

        dialog.setVisible(true);
    }

    private void changeHotkey() {

        String text = ((MTextField) this.dialog.getContentPane().getComponentAt(60, 5)).getText();
        dialog.dispose();

    }

}
