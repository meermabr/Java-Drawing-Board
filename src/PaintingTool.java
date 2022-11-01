public class PaintingTool {

    private Main applet = Main.applet;

    public void drawText(String str, int x, int y) {
        applet.text(str, x, y);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        applet.line(x1, y1, x2, y2);
    }

    public void setLineThickness(int thickness) {
        applet.strokeWeight(thickness);
    }

    public void setLineColor(Color c) {
        applet.stroke(c.getRed(), c.getGreen(), c.getBlue());
    }

    public void setLineColor(int v1, int v2, int v3) {
        applet.stroke(v1, v2, v3);
    }

    public void drawRect(int leftX, int topY, int width, int height) {
        applet.rect(leftX, topY, width, height);
    }

    public void drawCircle(int centerX, int centerY, int radius) {
        applet.circle(centerX, centerY, 2 * radius);
    }

    public void setFillColor(Color c) {
        applet.fill(c.getRed(), c.getGreen(), c.getBlue());
    }

    public void setFillColor(int red, int green, int blue) {
        applet.fill(red, green, blue);
    }

}
