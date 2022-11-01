import java.awt.*;

public class ClearButton extends InteractiveButton {
    private DrawingBoard board;
    private PaintingTool paint = new PaintingTool();

    public ClearButton(int incomingX, int incomingY, int incomingSize, Color incomingColor, DrawingBoard incomingBoard) {
        super(incomingX, incomingY, incomingSize, incomingColor);
        board = incomingBoard;
    }

    @Override
    public void drawSelf() {
        super.drawSelf();

        paint.setLineColor(Color.RED);
        paint.drawLine(getLeftX(), getTopY() + getSize(), getLeftX() + getSize(), getTopY());
    }

    @Override
    public void performAction() {
        board.reset();
    }
}
