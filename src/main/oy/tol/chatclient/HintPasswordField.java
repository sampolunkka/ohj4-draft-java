package oy.tol.chatclient;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPasswordField;

class HintPasswordField extends JPasswordField implements FocusListener {

    private final String hint;
    private boolean showingHint;

    public HintPasswordField(final String hint) {
        super(hint);
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
        setEchoChar((char) 0);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText("");
            setEchoChar('*');
            showingHint = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (this.getText().isEmpty()) {
            super.setText(hint);
            showingHint = true;
            setEchoChar((char) 0);
        }
    }

    @Override
    public String getText() {
        return showingHint ? "" : super.getText();
    }
}