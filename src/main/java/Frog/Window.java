package Frog;

public class Window {
    WindowInit init;
    public Window() {
        init = new WindowInit();
        init.setVisible(true);
    }

    public void setSize(int width, int height) {
        init.setSize(width, height);
    }
}
