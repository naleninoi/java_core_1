package lesson_8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonListener implements ActionListener {
    private final JTextField in;
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
    public CalcButtonListener(JTextField in) {
        this.in = in;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        StringBuilder textField = new StringBuilder(in.getText());
        try {
            Object result = scriptEngine.eval(textField.toString());
            in.setText(result.toString());
        } catch (ScriptException scriptException){
            scriptException.printStackTrace();
        }
    }
}