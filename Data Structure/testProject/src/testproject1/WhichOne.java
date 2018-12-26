/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WhichOne extends JPanel {

    JFrame frame;
    JButton colorButton;
    JButton shapeButton;
    MyDrawing1 drawPanel;
    String messageColor = "Color Changed";
    String messageShape = "Shape Changed";

    public static void main(String args[]) {

        WhichOne w = new WhichOne();
        w.go();
    }

    public void go() {
        frame = new JFrame("Which One?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new MyDrawing1();

        colorButton = new JButton("Color");
        shapeButton = new JButton("Shape");

        colorButton.addActionListener(new ButtonListener());
        shapeButton.addActionListener(new ButtonListener());

        frame.getContentPane().add(BorderLayout.WEST, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, shapeButton);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

//    class ColorButtonListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent event) {
//            System.out.println(messageColor);
//        }
//    }
    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == colorButton) {

                drawPanel.increaseSt();
                colorButton.setText(drawPanel.getSt() + "");
//                repaint();
                System.out.println(messageColor);

            } else {
                drawPanel.decreaseSt();
                colorButton.setText(drawPanel.getSt() + "");
//                repaint();
                System.out.println(messageShape);
            }
            frame.repaint();
        }
    }

//    public void actionPerformed(ActionEvent event) {
//        if (event.getSource() == colorButton) {
//            System.out.println(messageColor);
//        } else {
//            System.out.println(messageShape);
//        }
//        frame.repaint();
//    }
//    class ShapeButtonListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent event) {
//            System.out.println(messageShape);
//        }
//    }
}

 class MyDrawing1 extends JPanel {

    int st = 0;

    public void setSt(int a) {
        st = a;

    }

    public void increaseSt() {
        st++;

    }

    public void decreaseSt() {
        st--;

    }

    public int getSt() {
        return st;

    }

    public void paintComponent(Graphics g) {

        if (st == 1) {
            g.setColor(Color.orange);
            g.fillRect(0, 0, getWidth(), getHeight());

        } else if (st == 2) {
            g.setColor(Color.orange);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.fillOval(30, 30, 40, 40);

        } else if (st == 3) {
            g.setColor(Color.orange);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.fillOval(30, 30, 40, 40);
            g.setColor(Color.red);
            g.fillOval(100, 30, 40, 40);

        } else if (st == 4) {

            g.setColor(Color.orange);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.fillOval(30, 30, 40, 40);
            g.setColor(Color.red);
            g.fillOval(100, 30, 40, 40);

            g.setColor(Color.red);
            g.fillOval(45, 100, 90, 20);

        } else if (st == 5) {

            g.setColor(Color.orange);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.red);
            g.fillOval(30, 30, 40, 40);
            g.setColor(Color.red);
            g.fillOval(100, 30, 40, 40);

            g.setColor(Color.red);
            g.fillOval(45, 100, 90, 20);

            g.setColor(Color.red);
            g.fillOval(80, 50, 20, 90);
        } else if (st == 6) {
            g.drawArc(100, 45, 80, 80, 0, 360);

            g.setColor(Color.blue);
            g.drawArc(120, 70, 10, 10, 0, 360);
            g.drawArc(150, 70, 10, 10, 0, 360);

            g.setColor(Color.magenta);
            g.drawLine(140, 85, 140, 100);

            g.setColor(Color.red);
            g.drawArc(110, 55, 60, 60, 0, -180);
        } else if (st == 7) {
            g.setColor(Color.YELLOW);
            g.fillOval(30, 30, 100, 100);
            g.setColor(Color.BLUE);
            g.fillOval(30 + 25, 30 + 25, 20, 20);
            g.fillOval(30 + 55, 30 + 25, 20, 20);
            g.setColor(Color.red);
            g.drawArc(30 + 25, 30 + 50, 40, 40, 0, -180);

        } else if (st == 8) {
            g.drawOval(60, 60, 200, 200);
            g.fillOval(90, 120, 50, 20);
            g.fillOval(190, 120, 50, 20);
            g.drawArc(110, 130, 95, 95, 0, -180);
        } else if (st == 9) {
            
        } else if (st == 10) {

        } else if (st == 11) {
        }

    }

//    
//            g.setColor(Color.orange);
//            g.fillRect(0, 0, getWidth(), getHeight());
//            g.setColor(Color.red);
//            g.fillOval(getWidth() / 4, getHeight() / 4,
//            getWidth() / 2, getHeight() / 2);  
}
