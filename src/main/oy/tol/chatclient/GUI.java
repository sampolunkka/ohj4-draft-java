package oy.tol.chatclient;

import javax.swing.*;
import java.awt.*;

public class GUI {

    String lipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut tellus elementum sagittis vitae et leo duis ut diam. Viverra tellus in hac habitasse platea dictumst. Aliquet enim tortor at auctor urna. Tempor nec feugiat nisl pretium fusce id velit. Egestas sed sed risus pretium quam vulputate dignissim suspendisse in. Turpis egestas integer eget aliquet nibh praesent tristique magna sit. Amet commodo nulla facilisi nullam vehicula ipsum a arcu. Faucibus scelerisque eleifend donec pretium vulputate sapien nec sagittis. Gravida neque convallis a cras semper auctor neque vitae tempus. Nec ullamcorper sit amet risus nullam eget felis eget. Ipsum suspendisse ultrices gravida dictum fusce. Eget est lorem ipsum dolor sit.";

    // Päänäkymä
    JFrame frame = new JFrame();

    // NORTH
    JMenu topMenu = new JMenu();
    JPanel topPanel = new JPanel();

    // EAST
    String userList[] = { "LOL", "OMG", "xXx_Seph1roth_xXx" };
    JList<String> usersFrame = new JList<>(userList);

    // WEST
    JTree navigationFrame = new JTree();

    // SOUTH
    JPanel bottomPanel = new JPanel();
    JTextField messageField = new JTextField();
    JButton messageSendButton = new JButton("Send");

    // CENTER
    JPanel mainPanel = new JPanel();
    JScrollPane chatPane = new JScrollPane();
    String messages[] = { "message1", "MEssage 22222", "message 3" };
    JTextArea messagesTextArea = new JTextArea(lipsum);

    public GUI() {
        topPanel.add(topMenu);

        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(messageField, BorderLayout.CENTER);
        bottomPanel.add(messageSendButton, BorderLayout.EAST);

        frame.setLayout(new BorderLayout());
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(usersFrame, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.add(navigationFrame, BorderLayout.WEST);

        // mainPanel.add(chatPane);
        // mainPanel.setLayout(new BorderLayout());
        chatPane.setViewportView(messagesTextArea);
        messagesTextArea.setLineWrap(true);
        messagesTextArea.setWrapStyleWord(true);
        chatPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(chatPane, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(600, 400));
    }
}
