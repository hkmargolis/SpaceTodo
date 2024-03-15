package space.todoapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author Hannah
 */
public class Frame extends JFrame {

    MenuBar menubar = new MenuBar();
    TaskPanel taskPanel = new TaskPanel();
    Buttons buttons = new Buttons();
    private JButton add_button;
    private JButton clearAll_button;
    private JButton complete_button;
    private JButton export_button;

    public Frame() {
        this.setTitle("SpaceTodo");
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(this.menubar, BorderLayout.NORTH);
        this.add(this.buttons, BorderLayout.SOUTH);
        this.add(this.taskPanel, BorderLayout.CENTER);

        add_button = buttons.getAddButton();
        clearAll_button = buttons.getClearAllButton();
        export_button = buttons.getExportButton();

        addlisteners();
    }

    public void addlisteners() {

        add_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task task = new Task();
                taskPanel.add(task);
                revalidate();

                task.getClearButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        taskPanel.remove(task);
                        revalidate();
                        repaint();
                    }
                });

                task.getCompleteButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        task.markTaskComplete();
                        revalidate();
                        repaint();
                    }
                });

            }
        });

        clearAll_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component[] tasks = taskPanel.getComponents();
                for (int i = 0; i < tasks.length; i++) {
                    if (tasks[i] instanceof Task) {
                        taskPanel.remove((Task) tasks[i]);
                    }
                }
                revalidate();
                repaint();
            }
        });

        export_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Component[] tasks = taskPanel.getComponents();
                String text;

                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("todo.txt"));
                    bw.write("TODO\n\n");
                    for (int i = 0; i < tasks.length; i++) {
                        if (tasks[i] instanceof Task) {
                            text = i + 1 + "." + ((Task) tasks[i]).getTaskText() + "\n";
                            bw.write(text);
                        }
                    }
                    bw.write("        ~+\n"
                            + "\n"
                            + "                 *       *\n"
                            + "           *                  |\n"
                            + "       O    .-.,=\"``\"=.    - o -\n"
                            + "             '=/_       \\     |\n"
                            + "          *   |  '=._    |\n"
                            + "               \\     `=./`,        '\n"
                            + "            .   '=.__.=' `='      *\n"
                            + "   +                         *\n"
                            + "        O      *               .\n"
                            + "");
                    bw.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

}
