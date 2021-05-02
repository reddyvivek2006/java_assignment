package Part4;

public class UnicycleFactory implements CycleFactory{


    @Override
    public Cycle manufacture() {
        return new Unicycle();
    }
}
