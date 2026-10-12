/**********************Q2-Devoir2 ITI1521....*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI extends JFrame implements ActionListener {
    Calculator cal;
    JTextField input;

    GUI(Calculator p) {
        cal = p;

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        input = new JTextField(25);
        topPanel.add(input);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(4, 5));

        String[] buttonLabels = {
            "0", "1", "2", "3", "C",
            "4", "5", "6", "7", "!",
            "8", "9", "+", "-", "*",
            "POW", "sqrt", "ln", "=", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            bottomPanel.add(button);
        }

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (str.equals("=")) {
            cal.compute();
            input.setText(Double.toString(cal.display()));
        } else if (str.equals("C")) {
            cal.clear();
            input.setText("");
        } else {
            input.setText(input.getText() + str);
        }
    }

    public static void main(String arg[]) {
        GUI gui = new GUI(new Calculator());
        gui.setVisible(true);
    }
}