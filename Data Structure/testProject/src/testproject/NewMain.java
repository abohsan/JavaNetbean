package testproject;

import javax.swing.JFrame;

public class NewMain {

    static Peach p = new Peach();
    static JFrame f = new JFrame("fff");

    public static void main(String[] args) {

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.add(p);

        f.setVisible(true);
//  p.setVisible(false);

    }

}
