public class Main{
    public static void main(String[] args) {
        Rodent rodentList[] = new Rodent[3];

        rodentList[0] = new Mouse();
        rodentList[0].food();
        rodentList[0].car();

        rodentList[1] = new Gerbil();
        rodentList[1].food();
        rodentList[1].car();

        rodentList[2] = new Hamster();
        rodentList[2].food();
        rodentList[2].car();


    }
}