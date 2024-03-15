package space.todoapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 * This class creates text field and buttons for task panel.
 *
 * @author Hannah
 */
public class Task extends JPanel {

    //Components of TaskPanel Object
    private JTextField taskText;
    private JButton complete;
    private JButton clear;

    //constructor
    public Task() {
        //set up Task JPanel
        GridLayout Layout = new GridLayout(1, 4);
        Layout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.BLACK);
        this.setLayout(Layout);

        //add complete button (check mark button)
        complete = new JButton("\u2714");
        complete.setBackground(Color.BLACK);
        complete.setForeground(Color.WHITE);
        complete.setBorder(new LineBorder(new Color(76, 0, 153)));
        this.add(this.complete);

        //add text field for user's to enter task
        taskText = new JTextField("Enter task...");
        taskText.setBackground(Color.BLACK);
        taskText.setForeground(Color.WHITE);
        taskText.setBorder(new LineBorder(new Color(76, 0, 153)));
        taskText.setEditable(true);
        taskText.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(this.taskText);

        //add clear button for user to delete individual task
        clear = new JButton("X");
        //clear.setPreferredSize(new Dimension(10, 10));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 12));
        clear.setBorder(new LineBorder(new Color(76, 0, 153)));
        this.add(this.clear);

    }

    //getters
    //returns complete button
    public JButton getCompleteButton() {
        return this.complete;
    }

    //returns clear button
    public JButton getClearButton() {
        return this.clear;
    }

    //returns the current text in the task text field (used for exporting list)
    public String getTaskText() {
        return this.taskText.getText();
    }

    //This function marks a task complete by changing the complete button (check mark button) to purple and making the text field no longer editable
    public void markTaskComplete() {
        this.complete.setBackground(new Color(76, 0, 153));
        this.taskText.setEditable(false);
        revalidate();
        repaint();
    }

}
