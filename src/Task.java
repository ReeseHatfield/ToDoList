import javax.swing.*;

public class Task extends JPanel {
    private String text = "";
    public Task(String text){
        this.text = text;

        JLabel textField = new JLabel(text);
        this.add(textField);
    }


    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
