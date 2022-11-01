import processing.core.PApplet;

public class Sketch extends PApplet {

  private DrawingApp app;
  
  /** This method defines the important feature of the sketch, primarily its size */
  public void settings() {
    size(600, 400);
  }

  /** This method runs once, at the beginning of the sketch */
  public void setup() {
    //colorMode(HSB, 255);
    app = new DrawingApp(this);
    app.initialLaunch();
  }

  /** This method runs over and over, generally aiming for 60 times per second */
  public void draw() {
    app.update();
    mousePressed = false;
  }

  public void fill(Color c) {
    fill(c.getRed(), c.getGreen(), c.getBlue());
  }

  public void stroke(Color c) {
    stroke(c.getRed(), c.getGreen(), c.getBlue());
  }

  public void drawCircle(int x, int y, int radius) {
    circle(x, y, radius * 2);    
  }
  
  public int getMouseX() {
    return mouseX;
  }

  public int getMouseY() {
    return mouseY;
  }
  
  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void mousePressed() {
    app.mousePressed();
  }

  public void mouseDragged() {
    app.mouseDragged();
  }

  public static void main(String[] args) {
    PApplet.main("Sketch");
  }
}
