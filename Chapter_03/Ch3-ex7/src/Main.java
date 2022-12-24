/* Exercise 5: (2) Create a class called Dog containing two Strings:
name and says. In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say. */


class Dog {
    String name;
    String says;
}
public class Main {
    static void compare(Dog dog1,Dog dog2) {
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println(".equals() on top references: " + dog1.equals(dog2));
        System.out.println("== on name: "+(dog1.name == dog2.name));
        System.out.println(".equals() on name: " + dog1.name.equals(dog2.name));
        System.out.println("== on Says: "+(dog1.says == dog2.says));
        System.out.println(".equals() on Says: " + dog1.says.equals(dog2.says));
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf";

        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
        Dog dog3 = dog1;
        System.out.println("Compareing dog1 and dog2 objects");
        compare(dog1, dog2);
        System.out.println("Compareing dog1 and dog3 objects");
        compare(dog1, dog3);
        System.out.println("Compareing dog2 and dog3 objects");
        compare(dog2, dog3);
    }
}