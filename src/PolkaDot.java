public class PolkaDot {
  private int radius;
  private Color color;

  public PolkaDot() {
    radius = Generator.randomInt(10, 30);
    color = new Color(
      Generator.randomInt(0, 255),
      255,
      255
    );
  }

  public Color getColor() {
    return color;
  }

  public int getRadius() {
    return radius;
  }
  
}