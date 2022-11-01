public class PenColorButton extends InteractiveButton {
    private PaintingTool paint = new PaintingTool();

    public PenColorButton(int incomingX, int incomingY, int incomingSize, Color incomingColor) {
        super(incomingX, incomingY, incomingSize, incomingColor);
    }

    @Override
    public void performAction() {
        paint.setLineColor(getColor());
    }
}
