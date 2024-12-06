package org.howard.edu.lsp.finalexam.question3;

/**
 * ShapeFactory is a Singleton class responsible for creating shapes.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() { }

    /**
     * Get the singleton instance of ShapeFactory.
     * @return the ShapeFactory instance.
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Create a shape based on the shape type.
     * @param shapeType the type of shape to create.
     * @return the shape object.
     */
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
            return null;
        }
    }
}


