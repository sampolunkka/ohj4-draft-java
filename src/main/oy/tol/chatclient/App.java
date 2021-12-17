package oy.tol.chatclient;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;

public class App {

    static ChatClient client = new ChatClient();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                new LoginFrame(client);
            }

        });
    }

}