package space.todoapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This class creates the add task, clear all and export buttons.
 *
 * @author Hannah
 */
public class Buttons extends JPanel {

    //components
    private JButton add_button;
    private JButton clearAll_button;
    private JButton export_button;

    Border border = BorderFactory.createEmptyBorder();

    //constructor
    public Buttons() {
        //set Buttons JPanel
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.BLACK);

        //add add task button
        add_button = new JButton("Add Task");
        add_button.setBorder(border);
        add_button.setBackground(new Color(76, 0, 153));
        add_button.setForeground(Color.WHITE);
        add_button.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(add_button);

        //add clear all button
        clearAll_button = new JButton("Clear All");
        clearAll_button.setBorder(border);
        clearAll_button.setBackground(new Color(76, 0, 153));
        clearAll_button.setForeground(Color.WHITE);
        clearAll_button.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(clearAll_button);

        //add export button
        export_button = new JButton("Export");
        export_button.setBorder(border);
        export_button.setBackground(new Color(76, 0, 153));
        export_button.setForeground(Color.WHITE);
        export_button.setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(export_button);
    }

    //getters
    //returns add button
    public JButton getAddButton() {
        return add_button;
    }

    //returns clear all button
    public JButton getClearAllButton() {
        return clearAll_button;
    }

    //returns export button
    public JButton getExportButton() {
        return export_button;
    }

}
