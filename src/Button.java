class Button {
  public int x;
  public int y;
  public int size;
  public Color color;

  private DrawingApp app;
  private Sketch sketch;

  public Button(DrawingApp applet, int x, int y, int size, Color color) {
    this.app = applet;
    this.sketch = applet.getSketch();
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
  }

  public boolean isHovered() {
    if (x < sketch.getMouseX() && x + size > sketch.getMouseX() &&
       y < sketch.getMouseY() && y + size > sketch.getMouseY()) {
          return true;
       } else {
          return false;
       }
  }

  public void update() {
    if (sketch.mousePressed && isHovered()) {
      doAction();
    }
    drawSelf();
  }

  public void drawSelf() {

    if (isHovered()) {
      sketch.stroke(255);
    } else {
      sketch.stroke(0);
    }
    sketch.fill(color);
    sketch.rect(x, y, size-1, size);

  }

  public void doAction() {
    app.setStrokeColor(color);
  }
}