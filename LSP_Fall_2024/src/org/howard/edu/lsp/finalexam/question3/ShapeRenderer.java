package org.howard.edu.lsp.finalexam.question3;

/**
 * ShapeRenderer now uses ShapeFactory to create shapes.
 */
public class ShapeRenderer {
    private ShapeFactory shapeFactory;

    public ShapeRenderer() {
        this.shapeFactory = ShapeFactory.getInstance();
    }

    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}