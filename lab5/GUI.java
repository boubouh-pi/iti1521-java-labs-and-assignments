import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

public class GUI extends JFrame implements ActionListener {
    public static final int MAX_POINTS = 10;
    private Point[] tabPoints = new Point[MAX_POINTS];
    private int number = 0;
    private JPanel draw;
    public static final int DRAW_SIZE = 400;
    private Color changeColorDraw = Color.BLACK;

    public GUI() {
        super("GUI 6");
        setSize(DRAW_SIZE, DRAW_SIZE);

        JPanel panneau1 = new JPanel();
        panneau1.setBackground(Color.BLUE);
        add(panneau1, BorderLayout.NORTH);

        JButton bouton1, bouton2;
        bouton1 = new JButton("Shape");
        bouton1.addActionListener(this);
        panneau1.add(bouton1);

        bouton2 = new JButton("Quit");
        bouton2.addActionListener(this);
        panneau1.add(bouton2);

        draw = new DrawPanel();
        draw.setBackground(Color.WHITE);
        add(draw, BorderLayout.CENTER);

        setJMenuBar(createMenu());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("Color Menu");
        bar.add(menu);

        JMenuItem item = new JMenuItem("Black");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Red");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Green");
        item.addActionListener(this);
        menu.add(item);

        item = new JMenuItem("Blue");
        item.addActionListener(this);
        menu.add(item);

        return bar;
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Black")) {
            changeColorDraw = Color.BLACK;
        } else if (actionCommand.equals("Red")) {
            changeColorDraw = Color.RED;
        } else if (actionCommand.equals("Green")) {
            changeColorDraw = Color.GREEN;
        } else if (actionCommand.equals("Blue")) {
            changeColorDraw = Color.BLUE;
        } else if (actionCommand.equals("Quit")) {
            System.exit(0);
        }

        repaint();
    }

    private void addPoint(Point p) {
        if (number < MAX_POINTS)
            tabPoints[number++] = p;
    }

    private class DrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(changeColorDraw);

            int startX1 = DRAW_SIZE / 4;
            int startY1 = DRAW_SIZE / 2;
            int step1 = 5;
            int numPoints1 = (DRAW_SIZE / 2 - startX1) / step1;


            int middleX = DRAW_SIZE / 2;
            int middleY = DRAW_SIZE / 2;


            for (int i = 0; i < numPoints1; i++) {
                int x1 = middleX + startX1 + i * step1 - numPoints1 * step1 / 2;
                int y1 = startY1 - Math.abs(x1 - startX1);
                int x2 = middleX + startX1 + (i + 1) * step1 - numPoints1 * step1 / 2;
                int y2 = startY1 - Math.abs(x2 - startX1);

                g.drawLine(x1, y1, x2, y2);
            }


            int startX2 = middleX + startX1 - step1 - numPoints1 * step1 / 2;
            int startY2 = startY1 - Math.abs(startX2 - startX1);

            for (int i = 0; i < numPoints1; i++) {
                int x1 = middleX + startX1 - i * step1 - numPoints1 * step1 / 2;
                int y1 = startY2 - Math.abs(x1 - startX2);
                int x2 = middleX + startX1 - (i + 1) * step1 - numPoints1 * step1 / 2;
                int y2 = startY2 - Math.abs(x2 - startX2);

                g.drawLine(x1, y1, x2, y2);
            }
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
    }
}