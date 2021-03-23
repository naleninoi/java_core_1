package lesson_8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignButtonListener implements ActionListener {
    private final JTextField in;

    public SignButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        StringBuilder stringBuilder = new StringBuilder(in.getText());
        if (stringBuilder.length() > 0) {
            if(endsWithSign(stringBuilder)) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append(button.getText());
        } else {
            if(!button.getText().equals("-")) {
                stringBuilder.append("");
            } else {
                stringBuilder.append(button.getText());
            }
        }
        in.setText(stringBuilder.toString());
    }

    private boolean endsWithSign(StringBuilder s) {
        String signs = "+-*/";
        String lastSymbol = String.valueOf(s.charAt(s.length()-1));
        return signs.contains(lastSymbol);
    }

}