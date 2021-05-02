package Part4;

public class BicycleFactory implements CycleFactory{


    @Override
    public Cycle manufacture() {
        return new Bicycle();
    }
}
