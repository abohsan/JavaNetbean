/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author abdu
 */
public  class JframeTest extends JFrame implements ActionListener {

    private JLabel enterName;
    private JTextField name;
    private JButton click;
    private String storeName = "";
 Peach vv = new Peach();
    public JframeTest() {
        inti();

    }

    public void inti() {
       
        setTitle("Hello there");
        setLayout(null);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enterName = new JLabel("ff");
        name = new JTextField();
        click = new JButton("ff");
        enterName.setBounds(60, 30, 120, 30);

        name.setBounds(80, 60, 130, 30);
        click.setBounds(100, 190, 60, 30);
        click.addActionListener(this);
        add(click);
        add(name);
        add(enterName);
        add(vv);
   

    }


    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == click) {
            JOptionPane.showMessageDialog(null, "ffff");

        }
    }
}
