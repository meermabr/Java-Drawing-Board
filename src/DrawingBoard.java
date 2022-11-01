public class DrawingBoard {
    private Screen screen = new Screen();
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    public void initialLaunch() {
        // 1.1 Change the background color
        screen.setBackgroundColor(255, 255, 255);

        // 1.2 Identify the corners
        paint.setFillColor(255, 0, 0);
        paint.drawCircle(0, 0, 20);
        paint.setFillColor(0, 255, 0);
        paint.drawCircle(0, screen.getHeight(), 20);
        paint.setFillColor(0, 0, 255);
        paint.drawCircle(screen.getWidth(), 0, 20);
        paint.setFillColor(255, 255, 0);
        paint.drawCircle(screen.getWidth(), screen.getHeight(), 20);

        // 1.3 Draw a frame
        paint.drawRect(30, 30, screen.getWidth() - 60, screen.getHeight() - 60);

    }

    public void update() {



        paint.setLineColor(Generator.randomInt(255), Generator.randomInt(255), Generator.randomInt(255));
        paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), screen.getWidth() / 2, screen.getHeight() / 2);
    }



}
