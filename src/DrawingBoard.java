public class DrawingBoard {
    private Screen screen = new Screen();
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    // TODO 2.1 add variables for the last coordinates
    private int lastMouseX;
    private int lastMouseY;

    public void initialLaunch() {
        // TODO 0.1 Change the background color
        screen.setBackgroundColor(Color.ORANGE);

        // TODO 0.2 Identify the corners
        paint.setFillColor(Color.RED);
        paint.drawCircle(0, 0, 20);

        paint.setFillColor(Color.GREEN);
        paint.drawCircle(0, 400, 20);

        paint.setFillColor(Color.BLUE);
        paint.drawCircle(600, 0, 20);

        paint.setFillColor(Color.MAGENTA);
        paint.drawCircle(600, 400, 20);

        // TODO 0.3 Draw an interior surface
        paint.setFillColor(Color.WHITE);
        paint.drawRect(30, 30, 540, 340);

    }

    public void update() {
        // TODO 1.1 Draw a line anywhere
        paint.setLineColor(Color.CYAN);
        // paint.drawLine(0, 0, 600, 400);

        // TODO 1.2 Generate random color values from 0 to 255 for red, green, and blue lines.
        paint.setLineColor(
                Generator.randomInt(255),
                Generator.randomInt(255),
                Generator.randomInt(255)
        );

        // TODO 1.3 Use the x and y coordinates of the mouse
        // paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), 0, 0);

        // TODO 1.4 Use the very center of the screen
        // paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), 300, 200);

        // TODO 1.5 Use the center of the screen without using the actual coordinates
        // paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), screen.getWidth() / 2, screen.getHeight() / 2);

        // TODO 2.2 Use the current and last locations of the mouse to draw the lines
        // paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);

        // TODO 2.3 Update the last location values of the mouse
        // lastMouseX = mouseInfo.getX();
        // lastMouseY = mouseInfo.getY();

        // TODO 3.1 Update lastMouseX and lastMouseY when the mouse is pressed
        if (mouseInfo.isMousePressed()) {
            lastMouseX = mouseInfo.getX();
            lastMouseY = mouseInfo.getY();
        }

        // TODO 3.2 Restrict the drawing to only when the mouse is dragged
        // if (mouseInfo.isMouseDragged()) {
        //    paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);
        //    lastMouseX = mouseInfo.getX();
        //    lastMouseY = mouseInfo.getY();
        // }

        // TODO 3.3 Restrict the drawing to only when the mouse is dragged and inside the border
        if (mouseInfo.isMouseDragged() &&
            mouseInfo.getX() >= 30 &&
            mouseInfo.getX() <= 570 &&
            mouseInfo.getY() >= 30 &&
            mouseInfo.getY() <= 370) {

            paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);
            lastMouseX = mouseInfo.getX();
            lastMouseY = mouseInfo.getY();
        }


    }
}
