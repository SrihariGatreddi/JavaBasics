package AWTPROG;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class NameEmailValidator extends Frame implements ActionListener {
    // GUI components
    TextField nameField, emailField;
    Label messageLabel;

    // Constructor to set up the GUI
    public NameEmailValidator() {
        // Set up the frame
        setLayout(new FlowLayout());

        // Create and add components
        add(new Label("Name:"));
        nameField = new TextField(20);
        add(nameField);

        add(new Label("Email:"));
        emailField = new TextField(20);
        add(emailField);

        Button validateButton = new Button("Validate");
        add(validateButton);
        validateButton.addActionListener(this);

        messageLabel = new Label();
        add(messageLabel);

        // Set frame properties
        setTitle("Name and Email Validator");
        setSize(300, 150);
        setVisible(true);

        // Close the window when the close button is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Method to validate the name and email
    public void actionPerformed(ActionEvent ae) {
        String name = nameField.getText();
        String email = emailField.getText();

        if (isValidName(name) && isValidEmail(email)) {
            messageLabel.setText("Valid name and email id");
        } else {
            messageLabel.setText("Invalid name or email id");
        }
    }

    // Method to check if the name contains only alphabets
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // Method to check if the email is in a valid format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new NameEmailValidator();
    }
}
