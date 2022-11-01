public class MouseInfo {
    private Main applet = Main.applet;

    public int getX() {
        return applet.mouseX;
    }

    public int getY() {
        return applet.mouseY;
    }

    public boolean isMousePressed() {
        return applet.isMousePressed();
    }

    public boolean isMouseReleased() {
        return applet.isMouseReleased();
    }

    public boolean isMouseDragged() {
        return applet.isMouseDragged();
    }
}
