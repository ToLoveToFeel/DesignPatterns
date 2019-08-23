package BridgePattern;

public class Circle extends Shape {
    private int x, y, radiux;

    public Circle(int x, int y, int radiux, DrawAPI drawAPI)
    {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radiux = radiux;
    }

    @Override
    public void draw()
    {
        drawAPI.drawCircle(radiux, x, y);
    }
}
