package lesson_8;

import javax.swing.*;
import java.awt.*;


public class ApplicationFrame extends JFrame {
    public ApplicationFrame() {
        setTitle("Application Frame v.1.0");
        setBounds(50, 50, 400, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenuBar());
        setLayout(new BorderLayout());

        JPanel top = createTop();
        add(top, BorderLayout.NORTH);
        Component component = top.getComponent(0);


        add(createBottom((JTextField) component), BorderLayout.CENTER);

        setVisible(true);

    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = menuBar.add(new JMenu("File"));
        menu.add(new JMenuItem("Power Safe Mode"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());
        return menuBar;
    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        Font font = new Font("Courier New", Font.BOLD, 26);
        top.setLayout(new BorderLayout());
        JTextField in = new JTextField();
        in.setFont(font);
        in.setForeground(Color.green);
        in.setBackground(Color.black);
        in.setEditable(false);
        top.add(in, BorderLayout.CENTER);
        return top;
    }

    private JPanel createBottom(JTextField in) {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1,2));
        bottom.add(createDigitsPanel(in));
        bottom.add(createSignsPanel(in));

        return bottom;
    }

    private JPanel createDigitsPanel(JTextField in) {
        JPanel digits = new JPanel();
        Font font = new Font("Arial", Font.BOLD, 20);
        digits.setLayout(new GridLayout(5,2));
        ButtonListener buttonListener = new ButtonListener(in);
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(buttonListener);
            btn.setFont(font);
            digits.add(btn);
        }
        return digits;
    }

    private JPanel createSignsPanel(JTextField in) {
        JPanel signs = new JPanel();
        signs.setLayout(new GridLayout(5,2));
        ButtonListener buttonListener = new ButtonListener(in);
        ClearButtonListener clearButtonListener = new ClearButtonListener(in);
        SignButtonListener signButtonListener = new SignButtonListener(in);
        SquareRootButtonListener squareRootButtonListener = new SquareRootButtonListener(in);
        CalcButtonListener calcButtonListener = new CalcButtonListener(in);
        Font font = new Font("Arial", Font.BOLD, 20);

        JButton plus = new JButton("+");
        plus.addActionListener(signButtonListener);
        plus.setFont(font);

        JButton minus = new JButton("-");
        minus.addActionListener(signButtonListener);
        minus.setFont(font);

        JButton mult = new JButton("*");
        mult.addActionListener(signButtonListener);
        mult.setFont(font);

        JButton div = new JButton("/");
        div.addActionListener(signButtonListener);
        div.setFont(font);

        JButton dot = new JButton(".");
        dot.addActionListener(buttonListener);
        dot.setFont(font);

        JButton root = new JButton("√");
        root.addActionListener(squareRootButtonListener);
        root.setFont(font);

        JButton calc = new JButton("=");
        calc.addActionListener(calcButtonListener);
        calc.setFont(font);
        calc.setBackground(Color.green);

        JButton clear = new JButton("C");
        clear.addActionListener(clearButtonListener);
        clear.setFont(font);
        clear.setBackground(Color.red);

        signs.add(plus);
        signs.add(minus);
        signs.add(mult);
        signs.add(div);
        signs.add(dot);
        signs.add(root);
        signs.add(calc);
        signs.add(clear);

        return signs;
    }
}
