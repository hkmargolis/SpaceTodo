package space.todoapp;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * This class creates a TaskPanel object.
 *
 * @author Hannah
 */
public class TaskPanel extends JPanel {

    //constructor
    public TaskPanel() {
        //set up TaskPanel JPanel
        GridLayout Layout = new GridLayout(10, 1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        this.setBackground(Color.BLACK);
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
    }
}
