/* Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
 Test for comparison using == and equals( ) for all references.*/

class Dog {
    String name;
    String says;
}
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf";

    }
}