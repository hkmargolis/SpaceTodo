package space.todoapp;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hannah
 */
public class TaskPanel extends JPanel {

    public TaskPanel() {
        GridLayout Layout = new GridLayout(10, 1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        this.setBackground(Color.BLACK);
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
    }
}
