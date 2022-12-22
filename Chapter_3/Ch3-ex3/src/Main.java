/* Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during method call. */
class FloatNum {
    float num;
}
class PassObject {
    public static void f(FloatNum f) {
        f.num = 1.25f;
    }
    public static void main(String[] args) {
        FloatNum x = new FloatNum();
        x.num = 1.23f;
        System.out.println("1:  x.num: " + x.num);
        f(x);
        System.out.println("2:  x.num: " + x.num);
    }
}