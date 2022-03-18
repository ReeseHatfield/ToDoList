import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{
    public MainPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        outerPanel();
        centerPanel();
    }

    public void outerPanel(){
        JPanel outerPanel = new JPanel();

        this.add(outerPanel);

        outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.X_AXIS));

        JTextField inputField = new JTextField();
        inputField.setSize(200,60);
        inputField.setColumns(16);
        outerPanel.add(inputField);


        //JButton addButton = new JButton(new ImageIcon("plus.png"));
        JButton addButton = new JButton();
        outerPanel.add(addButton);
        addButton.setSize(60,60);


        addButton.addActionListener(e ->{
            String inputText = inputField.getText();
            if(!inputText.equals("") && inputText.length() < 20){
                makeTask(inputText);

            }
            this.repaint();
            inputField.setText("");
        });
    }

    public void centerPanel(){
        JPanel centerPanel = new JPanel();
        this.add(centerPanel);
        centerPanel.setLayout(new FlowLayout());
        JLabel title = new JLabel("ToDo List");
        title.setFont(new Font("SansSerif", java.awt.Font.BOLD,30));
        centerPanel.add(title);
    }
    public void makeTask(String text){

        System.out.println("Button has been pressed");
        System.out.println("The task is " + text);

        JPanel task = new JPanel();
        this.add(task);

        task.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        task.setLayout(new BorderLayout());
        JLabel taskText = new JLabel(text);
        taskText.setFont(new Font("SansSerif", java.awt.Font.BOLD,20));

        task.add(taskText,BorderLayout.WEST);

        JButton button = new JButton();
        task.add(button, BorderLayout.EAST);

        button.addActionListener(e ->{
            this.remove(task);
            this.repaint();
        });
        this.repaint();




    }

}
