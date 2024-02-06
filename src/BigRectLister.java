import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {

        //rectangle perimiter is width x2 + height x2 i think.
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(6, 2));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(7, 4));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(2, 3));

        Filter bigRectangleFilter = new BigRectangleFilter();
        ArrayList<Rectangle> bigRectangles = CollectAll.collectAll(rectangles.toArray(new Rectangle[0]), bigRectangleFilter);

        System.out.println("Big rectangles with perimeter > 10):");
        for (Rectangle rectangle : bigRectangles) {
            double perimeter = (rectangle.getWidth() + rectangle.getHeight()) * 2;
            System.out.println("Rectangle - Perimeter: " + perimeter);
        }
    }
}
