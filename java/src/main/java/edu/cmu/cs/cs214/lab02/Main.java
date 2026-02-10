package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        //Shape d objectuud uusgej bn.
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        
        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer circleRenderer = new Renderer(circle);
        Renderer squareRenderer = new Renderer(square);
        //Dursuudig draw ashiglana hevlej bn.
        circleRenderer.draw();// Dugui dursiin talbai hevleh.
        rectangleRenderer.draw();//Durvuljin dursiin talbai hevleh.
        squareRenderer.draw();//Kvadrat dursiin talbai hevleh.
    }
}