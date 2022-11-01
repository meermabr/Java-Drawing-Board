public class Color {
  private final int RED;
  private final int GREEN;
  private final int BLUE;

  public Color(int gray) {
    RED = gray;
    GREEN = gray;
    BLUE = gray;
  }

  public Color(int red, int green, int blue) {
    this.RED = Math.max(0, Math.min(255, red));
    this.GREEN = Math.max(0, Math.min(255, green));;
    this.BLUE = Math.max(0, Math.min(255, blue));;
  }

  public int getRed() {
    return RED;
  }

  public int getGreen() {
    return GREEN;
  }

  public int getBlue() {
    return BLUE;
  }
  
  
}