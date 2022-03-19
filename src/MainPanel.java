import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{
    public MainPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //calls both methods that create the panels
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        outerPanel();
        centerPanel();
    }

    public void outerPanel(){
        JPanel outerPanel = new JPanel();
        //this method handles the upper pannel, text input, and add button
        this.add(outerPanel);

        outerPanel.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        inputField.setFont(new Font("SansSerif", java.awt.Font.BOLD, 15));

        inputField.setSize(200,60);
        inputField.setColumns(16);
        outerPanel.add(inputField, BorderLayout.WEST);


        JButton addButton = new JButton(new ImageIcon("plus.png"));
        //JButton addButton = new JButton();
        outerPanel.add(addButton, BorderLayout.EAST);
        addButton.setSize(1000,1000);


        addButton.addActionListener(e ->{
            String inputText = inputField.getText();
            //when the button is pressed, it calls the make new task method
            if(!inputText.equals("") && inputText.length() < 20){
                makeTask(inputText);
            }
            this.repaint();
            inputField.setText("");
        });
    }

    public void centerPanel(){
        //this is the panel with the title
        JPanel centerPanel = new JPanel();
        this.add(centerPanel);
        centerPanel.setLayout(new FlowLayout());
        JLabel title = new JLabel("ToDo List: ");
        title.setFont(new Font("SansSerif", java.awt.Font.BOLD,30));
        centerPanel.add(title);
    }
    public void makeTask(String text){
        //every time this method is called, it creates a new panel with the task inside it
        JPanel task = new JPanel();
        this.add(task);

        task.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        task.setLayout(new BorderLayout());
        JLabel taskText = new JLabel(text);
        taskText.setFont(new Font("SansSerif", java.awt.Font.BOLD,20));

        task.add(taskText,BorderLayout.WEST);

        JButton button = new JButton(new ImageIcon("tick-mark.png"));
        task.add(button, BorderLayout.EAST);


        button.addActionListener(e ->{
            //this button deletes the task upon completion
            this.remove(task);
            this.repaint();
        });

        this.repaint();




    }

}
