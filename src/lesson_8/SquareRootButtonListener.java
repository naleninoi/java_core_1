package lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareRootButtonListener implements ActionListener {
    private final JTextField in;

    public SquareRootButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textField = in.getText();
        try {
            double textFieldValue = Double.parseDouble(textField);
            double result = Math.sqrt(textFieldValue);
            in.setText(String.valueOf(result));
        } catch (NumberFormatException numberFormatException) {
            in.setText("ЕГГОГ");
        }
    }
}