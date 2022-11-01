public class DrawingBoard {
    private Screen screen = new Screen();
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    // TODO 2.1
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

        // TODO 2.2
        paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);

        // TODO 2.3
        lastMouseX = mouseInfo.getX();
        lastMouseY = mouseInfo.getY();
    }
}
