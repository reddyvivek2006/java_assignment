package Part3;

public class Main extends Concrete implements Combine{
    @Override
    public void life() {
        System.out.println("THIS IS A LIFE");
    }

    @Override
    public void food() {
        System.out.println("THIS IS A FOOD");
    }

    @Override
    public void car() {
        System.out.println("THIS IS A CAR");
    }

    @Override
    public void school() {

    }

    @Override
    public void college() {
        System.out.println("THIS IS A COLLEGE");
    }

    @Override
    public void laptop() {
        System.out.println("THIS IS A LAPTOP");

    }

    @Override
    public void computer() {
        System.out.println("THIS IS A COMPUTER");
    }
    void func1(Interface1 i1){
        System.out.println("THIS IS A FUNCTION 1");
    }

    void func2(Interface2 i2){
        System.out.println("THIS IS A FUNCTION 2");
    }

    void func3(Interface3 i3){
        System.out.println("THIS IS A FUNCTION 3");
    }

    void func4(Combine c){
        System.out.println("THIS IS A FUNCTION 4");
    }
}
