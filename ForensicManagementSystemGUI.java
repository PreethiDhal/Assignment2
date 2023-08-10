import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForensicManagementSystemGUI extends JFrame {
    private JTextField evidenceIdField;
    private JTextField evidenceNameField;
    private JTextArea descriptionArea;
    private JButton submitButton;

    public ForensicManagementSystemGUI() {
        setTitle("Forensic Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel evidenceIdLabel = new JLabel("Evidence ID:");
        evidenceIdField = new JTextField();
        JLabel evidenceNameLabel = new JLabel("Evidence Name:");
        evidenceNameField = new JTextField();
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionArea = new JTextArea();
        submitButton = new JButton("Submit");

        mainPanel.add(evidenceIdLabel);
        mainPanel.add(evidenceIdField);
        mainPanel.add(evidenceNameLabel);
        mainPanel.add(evidenceNameField);
        mainPanel.add(descriptionLabel);
        mainPanel.add(descriptionArea);
        mainPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add code to handle submission and database integration
                String evidenceId = evidenceIdField.getText();
                String evidenceName = evidenceNameField.getText();
                String description = descriptionArea.getText();

                // TODO: Perform validation and database insertion
                // For now, let's just print the entered data
                System.out.println("Evidence ID: " + evidenceId);
                System.out.println("Evidence Name: " + evidenceName);
                System.out.println("Description: " + description);
            }
        });

        getContentPane().add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ForensicManagementSystemGUI gui = new ForensicManagementSystemGUI();
            gui.setVisible(true);
        });
    }
}
