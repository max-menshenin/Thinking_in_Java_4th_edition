/* Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.  */

package floatAliasing;
class Shape {
    float area;
    Shape(float area) {
        this.area = area;
    }
}

public class Aliasing {

    public static void main(String[] args) {
        Shape shape1 = new Shape(3.5f);
        Shape shape2 = shape1;
        shape2.area = 2.0f;
        System.out.println(shape1.area);

    }

}