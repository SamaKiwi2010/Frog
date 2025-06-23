package Frog;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    boolean w,s,up,down,enter = false;

    @Override public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            w = true;
        }
        if (code == KeyEvent.VK_S) {
            s = true;
        }
        if (code == KeyEvent.VK_UP) {
            up = true;
        }
        if (code == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (code == KeyEvent.VK_ENTER) {
            enter = true;
        }
    }

    @Override public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W) {
            w = false;
        }
        if (code == KeyEvent.VK_S) {
            s = false;
        }
        if (code == KeyEvent.VK_UP) {
            up = false;
        }
        if (code == KeyEvent.VK_DOWN) {
            down = false;
        }
        if (code == KeyEvent.VK_ENTER) {
            enter = false;
        }
    }

    @Override public void keyTyped(KeyEvent e) {}
}
