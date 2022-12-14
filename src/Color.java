public class Color {

  public static Color BLACK = new Color(0);
  public static Color DARK_GRAY = new Color(64);
  public static Color GRAY = new Color(128);
  public static Color LIGHT_GRAY = new Color(192);
  public static Color WHITE = new Color(255);

  public static Color RED = new Color(255, 0, 0);
  public static Color GREEN = new Color(0, 255, 0);
  public static Color BLUE = new Color(0, 0, 255);

  public static Color MAGENTA = new Color(255, 0, 255);
  public static Color YELLOW = new Color(255, 255, 0);
  public static Color CYAN = new Color(0, 255, 255);

  public static Color PURPLE = new Color(128, 0, 128);
  public static Color ORANGE = new Color(255,165,0);

  private final int redValue;
  private final int greenValue;
  private final int blueValue;

  public Color(int gray) {
    redValue = gray;
    greenValue = gray;
    blueValue = gray;
  }

  public Color(int red, int green, int blue) {
    this.redValue = Math.max(0, Math.min(255, red));
    this.greenValue = Math.max(0, Math.min(255, green));;
    this.blueValue = Math.max(0, Math.min(255, blue));;
  }

  public Color(float hue) {
    int rgb = java.awt.Color.HSBtoRGB(hue, 1, 1);
    redValue = (rgb >> 16) & 0xFF;
    greenValue = (rgb >> 8) & 0xFF;
    blueValue = rgb & 0xFF;
  }

  public Color(float hue, float saturation, float brightness) {
    float h = hue * 255;
    int rgb = java.awt.Color.HSBtoRGB(h, saturation, brightness);
    redValue = (rgb >> 16) & 0xFF;
    greenValue = (rgb >> 8) & 0xFF;
    blueValue = rgb & 0xFF;
  }

  public int getRed() {
    return redValue;
  }

  public int getGreen() {
    return greenValue;
  }

  public int getBlue() {
    return blueValue;
  }
  
  
}