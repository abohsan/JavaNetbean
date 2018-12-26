/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author abdu
 */
public class Peach extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponents(g);

//        setBackground(Color.yellow);
        g.setColor(Color.red);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(12, 12, 12));

        g.drawOval(110, 110, 50, 50);

    }

}
