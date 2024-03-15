package space.todoapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Hannah
 */
public class Task extends JPanel {

    private JTextField taskText;
    private JButton complete;
    private JButton clear;

    public Task() {
        GridLayout Layout = new GridLayout(1, 4);
        Layout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.BLACK);
        this.setLayout(Layout);

        complete = new JButton("\u2714");
        complete.setBackground(Color.BLACK);
        complete.setForeground(Color.WHITE);
        //complete.setBorder(new LineBorder(new Color(76, 0, 153)));
        this.add(this.complete);

        taskText = new JTextField("Enter task...");
        taskText.setBackground(Color.BLACK);
        taskText.setForeground(Color.WHITE);
        taskText.setBorder(new LineBorder(new Color(76, 0, 153)));
        taskText.setEditable(true);
        taskText.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(this.taskText);

        clear = new JButton("X");
        //clear.setPreferredSize(new Dimension(10, 10));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Arial", Font.BOLD, 12));
        clear.setBorder(new LineBorder(new Color(76, 0, 153)));
        this.add(this.clear);

    }

    public JButton getCompleteButton() {
        return this.complete;
    }

    public JButton getClearButton() {
        return this.clear;
    }

    public void markTaskComplete() {
        this.complete.setBackground(new Color(76, 0, 153));
        this.taskText.setEditable(false);
        revalidate();
        repaint();
    }

    public String getTaskText() {
        return this.taskText.getText();
    }
}
