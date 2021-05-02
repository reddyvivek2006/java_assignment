package Part2;

public class Main {
    public static void main(String[] args) {

        Cycle c[] = new Cycle[3];

        Tricycle tri = new Tricycle();
        Bicycle bi = new Bicycle();
        Unicycle uni = new Unicycle();

        //UPCASTING

        c[0]=uni;
        c[1]=bi;
        c[2]=tri;

        c[0].balance();
        c[1].balance();
        c[2].balance();


        Unicycle u1 = (Unicycle) c[0];
        Bicycle b1 = (Bicycle) c[1];
        Tricycle t1 = (Tricycle) c[2];
        //  Unicycle u2=(Unicycle) new Cycle();
        //  u2.balance(); we get exception for downcasting.
        u1.balance();
        b1.balance();
        t1.balance();

    }
}
