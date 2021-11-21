package homework5.pro2;

public class ShapeMaker {


    private Shape shape;
    public ShapeMaker(Shape shape) {
        this.shape=shape;
    }

    public void drawCircle() {
        this.shape.draw();
    }

    public void drawRectangle() {
        this.shape.draw();
    }

    public void drawSquare() {
        this.shape.draw();
    }
}
