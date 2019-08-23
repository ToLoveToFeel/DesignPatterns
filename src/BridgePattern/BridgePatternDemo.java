//7.桥接模式
package BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 200, 20, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
