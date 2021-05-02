package Part4;

public class Main {

    public static void main(String args[]){

            UnicycleFactory u1=new UnicycleFactory();
            Cycle c1= u1.manufacture();

            BicycleFactory b1=new BicycleFactory();
            Cycle c2=b1.manufacture();

            TricycleFactory t1=new TricycleFactory();
            Cycle c3=t1.manufacture();

            c1.wheels();
            c2.wheels();
            c3.wheels();
        }
    }

