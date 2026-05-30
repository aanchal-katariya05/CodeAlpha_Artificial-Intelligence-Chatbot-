import java.awt.*;
import javax.swing.*;

public class ChatBotGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI ChatBot");

        frame.setLayout(new FlowLayout());

        JTextField input = new JTextField(20);

        JButton button = new JButton("Send");

        frame.add(input);
        frame.add(button);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}