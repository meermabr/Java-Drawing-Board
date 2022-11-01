import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }






























    /* Utilities to Interact with the Processing Library */

    public static Main applet;

    private DrawingBoard drawingBoard;
    private boolean mousePressed;
    private boolean mouseReleased;
    private boolean mouseDragged;

    public void settings() {
        applet = this;
        size(600, 400);

        drawingBoard = new DrawingBoard();
    }

    public void setup() {
        drawingBoard.initialLaunch();
    }

    public void draw() {
        resetValues();
        drawingBoard.update();
    }

    public void resetValues() {
        mouseDragged = false;
        mousePressed = false;
        mouseReleased = false;
    }

    public void background(Color c) {
        super.background(c.getRed(), c.getGreen(), c.getBlue());
    }

    @Override
    public void mousePressed() {
        mousePressed = true;
    }

    @Override
    public void mouseReleased() {
        mouseReleased = true;
    }

    @Override
    public void mouseDragged() {
        mouseDragged = true;
    }

    public boolean isMousePressed() {
        return mousePressed;
    }

    public boolean isMouseReleased() {
        return mouseReleased;
    }

    public boolean isMouseDragged() {
        return mouseDragged;
    }


}
