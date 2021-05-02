package vivek.assignment.singleton;

public class Class2 {
    String S;

    public static Class2 initializeString(String s){
        Class2 c2=new Class2();
        c2.S=s;
        return c2;
    }
    public void printString(){
        System.out.println(S);


    }
}
