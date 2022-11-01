public class InteractiveButton {
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    private int leftX;
    private int topY;
    private int size;
    private Color color;
    // private DrawingBoard board;

    public InteractiveButton(int incomingX, int incomingY, int incomingSize, Color incomingColor) { //, DrawingBoard incomingBoard) {
        leftX = incomingX;
        topY = incomingY;
        size = incomingSize;
        color = incomingColor;
        // board = incomingBoard;
    }

    public void update() {
        if (isPressed()) {
            performAction();
        }
    }

    public void drawSelf() {
        paint.setLineColor(Color.BLACK);
        paint.setFillColor(color);
        paint.drawRect(leftX, topY, size, size);
    }

    public boolean isPressed() {
        return mouseInfo.isMousePressed() &&
                mouseInfo.getX() >= leftX &&
                mouseInfo.getX() <= leftX + size &&
                mouseInfo.getY() >= topY &&
                mouseInfo.getY() <= topY + size;
    }

    public Color getColor() {
        return color;
    }

    public void performAction() {
        // TODO 6
        // board.reset();
    }

    public int getLeftX() {
        return leftX;
    }

    public int getTopY() {
        return topY;
    }

    public int getSize() {
        return size;
    }
}
