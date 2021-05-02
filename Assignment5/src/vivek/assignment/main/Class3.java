package vivek.assignment.main;

import vivek.assignment.data.Class1;
import vivek.assignment.singleton.Class2;

public class Class3 {
    public static void main(String []args){
        Class1 class1=new Class1();
        class1.printVariables();
        class1.printAnother();

        Class2 c2=Class2.initializeString("hello");
        c2.printString();
    }
}
