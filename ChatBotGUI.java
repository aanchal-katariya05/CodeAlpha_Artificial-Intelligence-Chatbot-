import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatBotGUI() {

        setTitle("AI ChatBot");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel bottomPanel = new JPanel(new BorderLayout());

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String userText = inputField.getText();

                if (userText.isEmpty()) {
                    return;
                }

                chatArea.append("You: " + userText + "\n");

                String response =
                        ChatBotEngine.getResponse(userText);

                chatArea.append("Bot: " + response + "\n\n");

                inputField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatBotGUI();
    }
}