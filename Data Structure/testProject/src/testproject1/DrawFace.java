/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author abdu
 */
public class DrawFace extends JPanel {

    int st;

    public DrawFace() {
        st = 3;
    }

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
