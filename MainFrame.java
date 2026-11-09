import javax.swing.*;

public class MainFrame extends JFrame {
    private final JTextField nameField = new JTextField();
    private final JTextField emailField = new JTextField();
    private final JButton sendButton = new JButton("Sned");
    private final JButton loadButton = new JButton("Load");
    private final JButton clearButton = new JButton("Clear");
    private String savedName = "Dragan";
    private String savedEmail = "Draganov";

    public MainFrame() {
        super("JFrame Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 280);
        setResizable(false);
        setLayout(null);

        

        // setBounds(x, y, width, height) — координати и размери в пиксели.
        JLabel nameLabel = new JLabel("Име");
        nameLabel.setBounds(30, 160, 80, 25);
        nameField.setBounds(120, 160, 260, 25);

        JLabel emailLabel = new JLabel("Имейл");
        emailLabel.setBounds(30, 120, 80, 25);
        emailField.setBounds(120, 120, 260, 25);

        sendButton.setBounds(120, 30, 120, 30);
        loadButton.setBounds(260, 30, 120, 30);
        clearButton.setBounds(190, 75, 120, 30);
        sendButton.addActionListener(event -> send());
        loadButton.addActionListener(event -> load());
        clearButton.addActionListener(event -> clear());

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(sendButton);
        add(loadButton);
        add(clearButton);
        setLocationRelativeTo(null);
    }

    private void send() {
        savedName = nameField.getText();
        savedEmail = emailField.getText();
        System.out.println("Име: " + savedName + ", Имейл: " + savedEmail);
    }


    private void load() {
        nameField.setText(savedName);
        emailField.setText(savedEmail);
    }

    private void clear() {
        nameField.setText("");
        emailField.setText("");
    }
}

