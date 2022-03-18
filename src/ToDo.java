import javax.swing.*;
import java.awt.*;

public class ToDo {
    public static void main(String[] args) {new ToDo();}
    public ToDo(){
        JFrame frame = new JFrame("To Do Application");
        JPanel root = new JPanel();

        JPanel mp = new MainPanel();

        root.add(mp);


        frame.getContentPane().add(root);
        frame.setSize(290,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
