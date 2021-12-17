package oy.tol.chatclient;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusListener;

import javax.swing.*;

class LoginFrame extends JFrame implements ActionListener {

    private GUI gui;

    Color colContent = new Color(0x1D1F20);
    Color colHeader = new Color(0x393D3F);

    JPanel headerPanel = new JPanel();
    JPanel footerPanel = new JPanel();
    JPanel contentPanel = new JPanel();

    JLabel titleLabel = new JLabel(".smirc");

    JLabel loginLabel = new JLabel(".login");
    JLabel registerLabel = new JLabel(".register");

    JLabel usernLabel = new JLabel("username");
    JLabel emailLabel = new JLabel("email");
    JLabel passwLabel = new JLabel("password");
    JLabel confLabel = new JLabel("confirm password");

    JTextField usernField = new HintTextField("username");
    JTextField regUsernField = new HintTextField("username");
    JTextField emailField = new HintTextField("email");
    JTextField passwField = new HintTextField("password");
    JTextField regPasswField = new HintTextField("password");
    JTextField confField = new HintTextField("confirm password");

    JButton loginButton = new JButton("login");
    JButton registerButton = new JButton("register");

    public LoginFrame(GUI gui) {

        this.gui = gui;

        // BEGIN HEADER
        titleLabel.setFont(titleLabel.getFont().deriveFont(64.0f));
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        titleLabel.setHorizontalAlignment(JLabel.LEFT);
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(0, 80));
        headerPanel.setBackground(colHeader);
        headerPanel.setOpaque(true);
        headerPanel.add(titleLabel, BorderLayout.WEST);
        // END HEADER

        // BEGIN CONTENT
        contentPanel.setLayout(null);
        GridBagConstraints c = new GridBagConstraints();
        loginLabel.setBounds(100, 80, 400, 100);
        contentPanel.add(loginLabel);
        usernField.setBounds(100, 160, 200, 20);
        passwField.setBounds(100, 190, 200, 20);
        contentPanel.add(usernField);
        contentPanel.add(passwField);
        contentPanel.setBackground(colContent);
        contentPanel.setOpaque(true);
        loginLabel.setFont(loginLabel.getFont().deriveFont(35.0f));
        loginButton.setBounds(100, 220, 200, 20);
        loginButton.addActionListener(this);

        registerLabel.setBounds(100, 300, 400, 100);
        registerLabel.setFont(loginLabel.getFont().deriveFont(35.0f));

        regUsernField.setBounds(100, 380, 200, 20);
        emailField.setBounds(100, 410, 200, 20);
        regPasswField.setBounds(100, 440, 200, 20);
        confField.setBounds(100, 470, 200, 20);
        registerButton.setBounds(100, 500, 200, 20);

        // add a Text field -> takes default focus
        JTextField defaultFocus = new JTextField();
        defaultFocus.setEditable(false);

        contentPanel.add(defaultFocus);
        contentPanel.add(registerLabel);
        contentPanel.add(regUsernField);
        contentPanel.add(emailField);
        contentPanel.add(confField);
        contentPanel.add(regPasswField);
        contentPanel.add(registerButton);
        contentPanel.add(loginButton);

        // END CONTENT

        this.setLayout(new BorderLayout());

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(400, 720));
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(contentPanel, BorderLayout.CENTER);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            gui.login();
        }

    }
}