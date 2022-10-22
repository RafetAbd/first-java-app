package inheritance;

public class Animla_Main {

    public static void main(String[] args) {

        Animal a;

        Dog d = new Dog();
        d.whoAmI();

        Cat c = new Cat();
        c.whoAmI();

        // classic example of polymorphisim :
        a = new Dog();
        a.whoAmI();
        // a took the an object shape of Dog class.

    }

}
