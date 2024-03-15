package space.todoapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class creates the MenuBar. Currently this is only used to display the
 * "Captain's Log" text.
 *
 * @author Hannah
 */
public class MenuBar extends JPanel {

    private JLabel Header = new JLabel("Captain's Log");

    public MenuBar() {
        //set up MenuBar JPanel
        this.setBackground(Color.BLACK);//background of JPanel
        Header.setForeground(Color.WHITE);//text color
        Header.setPreferredSize(new Dimension(200, 80));
        Header.setFont(new Font("Helvetica", Font.PLAIN, 16));
        Header.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.Header, BorderLayout.NORTH);
    }

}
