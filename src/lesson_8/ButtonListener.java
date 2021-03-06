package lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private final JTextField in;

    public ButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        StringBuilder stringBuilder = new StringBuilder(in.getText());
        stringBuilder.append(button.getText());
        in.setText(stringBuilder.toString());
    }
}
