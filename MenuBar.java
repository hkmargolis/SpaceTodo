package space.todoapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author Hannah
 */
public class MenuBar extends JPanel {

    private JLabel Header = new JLabel("Captain's Log");

    public MenuBar() {
        //this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.BLACK);//background of JPanel
        Header.setForeground(Color.WHITE);//text color
        Header.setPreferredSize(new Dimension(200, 80));
        Header.setFont(new Font("Helvetica", Font.PLAIN, 16));
        Header.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.Header, BorderLayout.NORTH);
    }

}
