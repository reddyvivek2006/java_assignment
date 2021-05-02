package Part5;
class SecondOuterClass {
    class SecondInnerClass extends FirstOuterClass.FirstInnerClass {
        SecondInnerClass(FirstOuterClass f1,String s){
            f1.super(s);
        }

    }
}
