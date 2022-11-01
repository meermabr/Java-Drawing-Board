public class DrawingApp {
  private Sketch sketch;
  private int startX;
  private int startY;

  private int leftBorder;
  private int topBorder;
  private int rightBorder;
  private int bottomBorder;

  private Color strokeColor;
  private Button[] colorButtons;

  private final int NUM_COLORS = 16;
  

  public DrawingApp(Sketch applet) {
    this.sketch = applet;    

    leftBorder = 30;
    topBorder = 30;
    rightBorder = applet.getWidth() - 30;
    bottomBorder = applet.getHeight() - 30;

    strokeColor = new Color(0);

    colorButtons = new Button[NUM_COLORS];
    for (int i = 0; i < NUM_COLORS; i++) {
      Color color = new Color(255.0f/NUM_COLORS * i, 1, 1);
      colorButtons[i] = new Button(this, 35 + i * 25, 2, 25, color);
    }
  }

  public void initialLaunch() {
    
    sketch.background(150, 150, 75);

    for (int dotNum = 0; dotNum < 400; dotNum++) {
      int randX = Generator.randomInt(sketch.getWidth());
      int randY = Generator.randomInt(sketch.getHeight());
      
      PolkaDot dot = new PolkaDot();
      sketch.fill(dot.getColor());
      sketch.drawCircle(randX, randY, dot.getRadius());
    }
    
    sketch.fill(255);
    sketch.rect(30, 30, sketch.getWidth() - 60, sketch.getHeight() - 60);

    sketch.fill(0, 0, 50);
    sketch.rect(30, 0, sketch.getWidth() - 30, 30);
  }

  public void update() {    
    for (int i = 0; i < colorButtons.length; i++) {
      colorButtons[i].update();
    }

  }  

  public void mousePressed() {
    int x = sketch.getMouseX();
    int y = sketch.getMouseY();
    
    if (isInBorder(x, y)) {
      startX = x;
      startY = y;
    }
    
  }

  public void mouseDragged() {
    int x = sketch.getMouseX();
    int y = sketch.getMouseY();
    
    if (isInBorder(x, y)) {
      sketch.stroke(strokeColor);
      sketch.line(startX, startY, x, y);
        
      startX = x;
      startY = y;
    }
  }

  public boolean isInBorder(int x, int y) {
    return x >= leftBorder && y >= topBorder && x <= rightBorder && y <= bottomBorder;
  }

  public Sketch getSketch() {
    return sketch;
  }

  public void setStrokeColor(Color color) {
    strokeColor = color;
  }
  
  
}
