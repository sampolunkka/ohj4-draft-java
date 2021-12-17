package oy.tol.chatclient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GUI extends JFrame implements ChatClientDataProvider {

    public boolean loggedIn = false;
    JFrame frame;

    public GUI() {
        if (!loggedIn) {
            // frame = new LoginFrame(this);
        } else {
            // frame = new MainFrame(this);
        }
    }

    public void getMassages() {

    }

    public void login() {
        System.out.println("lol");
        loggedIn = true;
        frame.dispose();
        // frame = new MainFrame(this);
    }

    @Override
    public String getServer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getNick() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getContentTypeUsed() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean useModifiedSinceHeaders() {
        // TODO Auto-generated method stub
        return false;
    }
}
