package homework5.pro2;

public class Main {
    public static void main(String[] args) {

        ShapeMaker shapeMaker;



        Shape circle =new Circle();
        shapeMaker = new ShapeMaker(circle);
        shapeMaker.drawCircle();

        Shape rectangle =new Rectangle();
         shapeMaker = new ShapeMaker(rectangle);
        shapeMaker.drawRectangle();


        Shape square =new Square();
         shapeMaker = new ShapeMaker(square);
        shapeMaker.drawSquare();



    }
}
