import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) x;
            double perimeter = (rectangle.getWidth() + rectangle.getHeight()) * 2;
            return perimeter > 10;
        }
        return false;
    }
}