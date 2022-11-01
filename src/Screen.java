public class Screen {
    private Main applet = Main.applet;

    public int getWidth() {
        return applet.width;
    }

    public int getHeight() {
        return applet.height;
    }

    public void setBackgroundColor(int red, int green, int blue) {
        applet.background(Color.RED);
    }
}
