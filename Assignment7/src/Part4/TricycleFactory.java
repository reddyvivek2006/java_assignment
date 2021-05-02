package Part4;

public class TricycleFactory implements CycleFactory{

    @Override
    public Cycle manufacture() {
        return new Tricycle();

    }
}
