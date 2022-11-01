public class DrawingBoard {
    private Screen screen = new Screen();
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    public void initialLaunch() {
        // 1.1 Change the background color
        screen.setBackgroundColor(Color.ORANGE);

        // 1.2 Identify the corners
        paint.setFillColor(Color.RED);
        paint.drawCircle(0, 0, 20);
        paint.setFillColor(Color.GREEN);
        paint.drawCircle(0, screen.getHeight(), 20);
        paint.setFillColor(Color.BLUE);
        paint.drawCircle(screen.getWidth(), 0, 20);
        paint.setFillColor(Color.MAGENTA);
        paint.drawCircle(screen.getWidth(), screen.getHeight(), 20);

        // 1.3 Draw an interior surface
        paint.setFillColor(Color.WHITE);
        paint.drawRect(30, 30, screen.getWidth() - 60, screen.getHeight() - 60);

    }

    public void update() {



        paint.setLineColor(Generator.randomInt(255), Generator.randomInt(255), Generator.randomInt(255));
        paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), screen.getWidth() / 2, screen.getHeight() / 2);
    }



}
