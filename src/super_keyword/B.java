package super_keyword;

public class B extends A{

    int num1 = 200;
    public void doThis() {
        System.out.println("do this from class B");
    }

    public void xyz() {

        // to call dothis() from class A (super class) we add super method
        super.doThis();
        System.out.println("xyz excuted");
        System.out.println(super.num1);
    }

}
